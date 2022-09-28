package com.example.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginController {


    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "You made it!";
    }

    // Login form
    @RequestMapping("/login.html")
    public String login() {
        return "login.html";
    }

    // Login form with error
    @RequestMapping("/login-error.html")
    public String loginError() {
      //  model.addAttribute("loginError", true);
        return "login.html";
    }
}
