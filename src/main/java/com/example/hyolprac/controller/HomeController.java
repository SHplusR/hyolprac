package com.example.hyolprac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/earth")
public class HomeController {
    @GetMapping("/main")
    public void main(){
        System.out.println("main page");
    }
    @GetMapping("/login")
    public void login(){

    }

    @GetMapping("/signup")
    public void signup(){

    }

}
