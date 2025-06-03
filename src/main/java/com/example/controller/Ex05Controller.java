package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex05")
public class Ex05Controller {

    //入力ホーム表示
    @GetMapping("/")
    public String index(){
        return "ex-05";
    }

    @GetMapping("/receive-hobby")
    public String receiveHobby(){
        return "finished";
    }

}
