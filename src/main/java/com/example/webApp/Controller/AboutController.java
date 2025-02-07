package com.example.webApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {
    @RequestMapping("/about")
    public String about(){
        return "My name is Meghna. I am a software engineer";
    }
}
