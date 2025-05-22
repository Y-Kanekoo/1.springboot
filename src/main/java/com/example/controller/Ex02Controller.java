package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {

    @GetMapping("/show-kana-name")
    public String showKaneName(){

        return "redirect:/show-kana-name2";
    }

    @GetMapping("/show-kana-name2")
    public String showKaneName2(){

        return "ex-02";
    }
}
