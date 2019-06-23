package WEBPJ.commons.interceptor_co;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import WEBPJ.commons.interceptor.AuthInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Repository
public class AuthInterceptor_co extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor_co.class);

    private void saveDestination(HttpServletRequest request){
        String uri = request.getRequestURI();
        String query = request.getQueryString();
        if(query == null || query.equals("null")){
            query = "";
        } else {
            query = "?" + query;
        }

        if (request.getMethod().equals("GET")){
            logger.info("destination_co : " + (uri + query));
            request.getSession().setAttribute("destination_co", uri+query);
        }
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        HttpSession httpSession = request.getSession();

        if(httpSession.getAttribute("login_co") == null){
            logger.info("current user is not logged");
            response.sendRedirect("/user/login_co");
            return false;
        }

        return true;
    }
}
