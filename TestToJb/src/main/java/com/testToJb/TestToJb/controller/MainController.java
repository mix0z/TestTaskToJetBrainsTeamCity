package com.testToJb.TestToJb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "new user");
        return "home";
    }

    @GetMapping("/signin")
    public String signin(Model model) {
        model.addAttribute("title1", "new user");
        return "signin";
    }


}