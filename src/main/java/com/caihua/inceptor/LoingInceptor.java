package com.caihua.inceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoingInceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        String requestURI = request.getRequestURI();
        if ("/login".equals(requestURI)) {
            return true;
        }
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            return true;
        }
        response.sendRedirect("/login.jsp");
        return false;
    }
}
