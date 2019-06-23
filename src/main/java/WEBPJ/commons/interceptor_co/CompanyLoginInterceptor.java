package WEBPJ.commons.interceptor_co;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Repository
public class CompanyLoginInterceptor extends HandlerInterceptorAdapter {
    private static final String LOGIN_CO = "login_co";
    private static final Logger logger = LoggerFactory.getLogger(CompanyLoginInterceptor.class);

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
        HttpSession httpSession = request.getSession();
        ModelMap modelMap = modelAndView.getModelMap();
        Object companyVO = modelMap.get("company");

        if(companyVO != null){
            logger.info("new login success");
            httpSession.setAttribute(LOGIN_CO, companyVO);
            //response.sendRedirect("/");
            Object destination_co = httpSession.getAttribute("destination_co");
            response.sendRedirect(destination_co !=null ? (String) destination_co : "/");
        }
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        HttpSession httpSession = request.getSession();

        if(httpSession.getAttribute("LOGIN_CO") != null){
            logger.info("clear before login data");
            httpSession.removeAttribute((LOGIN_CO));
        }

        return true;
    }
}
