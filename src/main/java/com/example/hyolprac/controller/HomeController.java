package com.example.hyolprac.controller;

import com.example.hyolprac.dto.MemberDTO;
import com.example.hyolprac.service.SignupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j2
@RequestMapping("/earth")
@RequiredArgsConstructor
public class HomeController {
    private final SignupService signupService;
    @GetMapping("/main")
    public void main(){
        System.out.println("main page");
    }

    @PostMapping("/main")
    public String mainPost(MemberDTO dto, RedirectAttributes redirectAttributes){
      log.info("dto : "+dto);
      signupService.signup(dto);
      redirectAttributes.addFlashAttribute("msg",dto.getMno());
      return "redirect:/earth/board";
    }

    @GetMapping("/login")
    public void login(){
        System.out.println("login page");
    }
    @GetMapping("/signup")
    public void signup(){
        System.out.println("signup page");
    }

    @PostMapping("/signup")
    public void signupPost(MemberDTO dto){
        log.info("dto : "+ dto);
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
