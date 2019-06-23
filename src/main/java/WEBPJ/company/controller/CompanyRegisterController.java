package WEBPJ.company.controller;

import WEBPJ.company.domain.CompanyVO;
import WEBPJ.company.service.CompanyService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.inject.Inject;

@Controller
@Repository
@RequestMapping("/user")
public class CompanyRegisterController {
    private final CompanyService companyService;

    @Inject
    public CompanyRegisterController(CompanyService companyService){
        this.companyService = companyService;
    }

    @RequestMapping(value = "/register_co", method = RequestMethod.GET)
    public String registerGET() throws Exception{
        return "/register_co";
    }

    @RequestMapping(value = "/register_co", method = RequestMethod.POST)
    public String registerPOST(CompanyVO companyVO, RedirectAttributes redirectAttributes) throws Exception{
        String hashedPw = BCrypt.hashpw(companyVO.getCompanyPw(), BCrypt.gensalt());
        companyVO.setCompanyPw(hashedPw);
        companyService.register_co(companyVO);
        redirectAttributes.addFlashAttribute("msg","REGISTERED");

        return "redirect:/login_co";
    }
}
