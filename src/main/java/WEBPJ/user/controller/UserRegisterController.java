package WEBPJ.user.controller;

import WEBPJ.user.domain.UserVO;
import WEBPJ.user.service.UserService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.inject.Inject;

@Controller
@RequestMapping("/user")
public class UserRegisterController {
    private final UserService userService;

    @Inject
    public UserRegisterController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerGET() throws Exception{
        return "/user/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPOST(UserVO userVO, RedirectAttributes redirectAttributes) throws Exception{
        String hashedPW = BCrypt.hashpw(userVO.getUserPw(), BCrypt.gensalt());
        userVO.setUserPw(hashedPW);
        userService.register(userVO);
        redirectAttributes.addAttribute("msg","REGISTERED");

        return "redirect:/user/login";
    }
}
