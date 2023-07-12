package com.example.hyolprac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
        System.out.println("login page");
    }
    @GetMapping("/signup")
    public void signup(){
        System.out.println("signup page");
    }

@GetMapping("/board")
public void board(){
    System.out.println("get board");
}
    @PostMapping("/board")
    public void postBoard(){

    }
    @GetMapping("/register")
    public void register(){
        System.out.println("register");
    }
    @PostMapping("/register")
    public void postRegister(){

    }
}
