package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex06")
public class Ex06Controller {

    @GetMapping("")
    public String index(){
        return "ex-06";
    }

    @GetMapping("/receive-info")
    public String receiveInfo(){

        return "finished";
    }
}
