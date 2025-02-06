package com.abishek.MySpringWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String homePage(){
        return "This is the Home Page";
    }
}
