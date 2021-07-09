package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class greetingController {
    
    @GetMapping("/hi")
    public String welcome(Model model){
        model.addAttribute("userName", "Kim");
        return "greeting";
    }

    @GetMapping("/bye")
    public String bye(Model model){
        model.addAttribute("userName", "Kim");
        return "bye";
    }
}
