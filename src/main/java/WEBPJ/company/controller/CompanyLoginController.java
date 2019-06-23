package WEBPJ.company.controller;

import WEBPJ.company.domain.CompanyDTO;
import WEBPJ.company.domain.CompanyVO;
import WEBPJ.company.service.CompanyService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Controller
@Repository
@RequestMapping("/user")
public class CompanyLoginController {
    private final CompanyService companyService;

    @Inject
    public CompanyLoginController(CompanyService companyService){
        this.companyService = companyService;
    }

    @RequestMapping(value = "/login_co", method = RequestMethod.GET)
    public String login_coGET(@ModelAttribute("companyDTO")CompanyDTO companyDTO){
        return "/user/login_co";
    }

    @RequestMapping(value = "/E_Profile", method = RequestMethod.POST)
    public void E_Profile(CompanyDTO companyDTO, HttpSession httpSession, Model model) throws Exception{
        CompanyVO companyVO = companyService.login_co(companyDTO);

        if(companyVO == null || BCrypt.checkpw(companyDTO.getCompanyPw(), companyVO.getCompanyPw())){
            return;
        }

        model.addAttribute("company", companyVO);
    }
}
