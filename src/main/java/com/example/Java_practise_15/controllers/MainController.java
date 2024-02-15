package com.example.Java_practise_15.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String maga(Model model) {
        model.addAttribute("name","Главная страница");
        return "maga";
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
    @GetMapping("/career")
    public String career(Model model) {
        model.addAttribute("name","Главная страница");
        return "career";
    }





}
