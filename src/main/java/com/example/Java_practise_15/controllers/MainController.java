package com.example.Java_practise_15.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String academy(Model model) {
        model.addAttribute("name","Главная страница");
        return "academy";
    }
    @GetMapping("/advantages")
    public String advantages(Model model) {
        model.addAttribute("name","Главная страница");
        return "advantages";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("name","Главная страница");
        return "about";
    }
    @Autowired
private MessageSource messageSource;

@GetMapping("/career")
public String career(Model model) {
    model.addAttribute("name", "Главная страница");
    return "career";
}






}
