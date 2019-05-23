package com.caihua.controller;

import com.caihua.bean.User;
import com.caihua.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/findUser")
    public String findUser(int id, Model model) {
        User user = userService.findUser(id);
        model.addAttribute("user", user);
        return "forward:/WEB-INF/showUser.jsp";
    }

    @RequestMapping("/login")
    public String login(String name, String password, HttpServletResponse response, HttpSession session) {
        if ("caihua".equals(name) && "hua1996cai".equals(password)) {
            User user = new User();
            session.setAttribute("user", user);
            Cookie cookie = new Cookie("loginAlready", "YES");
            cookie.setMaxAge(1800);
            response.addCookie(cookie);
            return "success";
        }
        return "redirect:/login.jsp";
    }

}
