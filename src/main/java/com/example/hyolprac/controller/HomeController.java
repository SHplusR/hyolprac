package com.example.hyolprac.controller;

import com.example.hyolprac.dto.MemberDTO;
import com.example.hyolprac.service.MemberService;
import com.example.hyolprac.service.SignupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Log4j2
@RequestMapping("/earth")
@RequiredArgsConstructor
public class HomeController {
    private final SignupService signupService;
    private final MemberService memberService;
    @GetMapping("/main")
    public void main(){
        System.out.println("main page");
    }

    @PostMapping("/main")
    public String mainPost(MemberDTO dto){
        return null;
    }

    @GetMapping("/login")
    public void login(){
        System.out.println("login page");
    }
    @PostMapping("/login")
    public String loginPost(MemberDTO dto, RedirectAttributes redirectAttributes){
        log.info("dto : "+dto);
        boolean result = memberService.login(dto);
        if(result){
            redirectAttributes.addFlashAttribute("msg",dto.getId());
            return "redirect:/earth/board";
        }
         return "redirect:/earth/login";
    }
    @GetMapping("/signup")
    public void signup(){
        System.out.println("signup page");
    }

    @PostMapping("/signup")
    public String signupPost(MemberDTO dto,RedirectAttributes redirectAttributes){
        log.info("dto : "+dto);
        signupService.signup(dto);
        redirectAttributes.addFlashAttribute("msg",dto.getMno());
        return "redirect:/earth/board";
    }

    @PostMapping("/id-check")
    public @ResponseBody String idCheck(@RequestParam("MemberId") String id){
        System.out.println("MemberId : " + id);
        final String result = signupService.idCheck(id);
        if(result !=null){
            return "success";
        }
        else{
            return "fail";
        }
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
