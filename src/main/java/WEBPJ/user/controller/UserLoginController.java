package WEBPJ.user.controller;

import WEBPJ.user.domain.LoginDTO;
import WEBPJ.user.service.UserService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import WEBPJ.user.domain.UserVO;

@Controller
@RequestMapping("/user")
public class UserLoginController {
    private final UserService userService;

    @Inject
    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET(@ModelAttribute("loginDTO") LoginDTO loginDTO) {
        return "/user/login";
    }

    @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
    public void loginPOST(LoginDTO loginDTO, HttpSession httpSession, Model model) throws Exception {
        UserVO userVO = userService.login(loginDTO);

        if(userVO ==  null || !BCrypt.checkpw(loginDTO.getUserPw(), userVO.getUserPw())){
            return;
        }

        model.addAttribute("user", userVO);
    }
/*
    @Inject
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm(){
        return "/user/login";
    }

    @RequestMapping(value = "loginPost", method = RequestMethod.POST)
    public String loginPost(HttpSession httpSession, UserVO dto){
        String returnURL = "";
        if(httpSession.getAttribute("login") != null){
            httpSession.removeAttribute("login");
        }

        UserVO userVO = userService.login(dto);

        if(userVO != null){
            httpSession.setAttribute("login", userVO);
            returnURL = "redirect:/user/Profile";
        } else {
            returnURL = "redirect:/user/login";
        }

        return returnURL;
    }
*/
}
