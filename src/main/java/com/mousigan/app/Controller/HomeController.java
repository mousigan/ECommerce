package com.mousigan.app.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller //this was used to send the page to the user according to the Request

@RestController //this was used to send or show the simple string or the Text
// the Rest Controller can be also used after request mapping where @controller before the class name it
// it should be written as @ResponseBody
//      Representational State Transfer (REST)
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
//        System.out.println("Welcome to Spring MVC");
        return "Welcome to Spring MVC";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome to Spring MVC with the about";
    }
}
