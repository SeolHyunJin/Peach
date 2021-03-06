package WEBPJ.commons.interceptor;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.slf4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import java.lang.Object;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Repository
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private static final String LOGIN = "login";
    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
        HttpSession httpSession = request.getSession();
        ModelMap modelMap = modelAndView.getModelMap();
        Object userVO = modelMap.get("user");

        if(userVO != null){
            logger.info("new login success");
            httpSession.setAttribute(LOGIN, userVO);
            response.sendRedirect("/user/Profile");
            //Object destination = httpSession.getAttribute("destination");
            //response.sendRedirect(destination != null ? (String) destination : "/");
        }
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        HttpSession httpSession = request.getSession();

        if(httpSession.getAttribute(LOGIN) != null){
            logger.info("clear before login data");
            httpSession.removeAttribute((LOGIN));
        }

        return  true;
    }

}
