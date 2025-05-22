package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {

    // ログイン画面表示（GET）

    @GetMapping("")
    public String showLoginForm() {
        return "ex-04";
    }
    /**
     * ログインを判定するメソッド.
     *
     *
     * @return 成功ならsuccess画面,失敗ならfailure画面
     */
    // ログイン判定（POST）
    @PostMapping ("/login")
    public String login(
            @RequestParam("email") String email,
            @RequestParam("pass") String pass) {

        if ("abc@gmail.com".equals(email) && "abc".equals(pass)) {

            return "ex-04-success";
        } else {

            return "ex-04-failure";
        }
    }


}
