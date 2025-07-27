package com.mousigan.app.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping
    public String login() {
        return "Welcome to Spring MVC with the login";
    }
}
