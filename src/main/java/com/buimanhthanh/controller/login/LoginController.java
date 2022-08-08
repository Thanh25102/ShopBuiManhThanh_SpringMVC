package com.buimanhthanh.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping(value = {"/login","/dang-nhap"})
    public String login() {
        return "login/login";
    }

    @GetMapping(value={"/register","dang-ky"})
    public String register(){
        return "login/register";
    }

    @GetMapping(value={"/forgot-password","/quen-mat-khau"})
    public String forgotPassword(){
        return "login/forgot-password";
    }
}
