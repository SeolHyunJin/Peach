package WEBPJ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.*;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model){
        return "user/login";
    }
}
