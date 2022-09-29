package com.bitrekz.bolsta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainPageController {

    @GetMapping(path = {"", "/", "/index"})
    public String mainPage(Model model){
        return "index";
    }
}
