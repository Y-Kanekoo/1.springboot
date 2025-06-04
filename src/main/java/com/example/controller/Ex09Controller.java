package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ex09")
public class Ex09Controller {

    /**
     * ログイン画面を表示するメソッド
     * @return ex-09.html というテンプレート名を返す
     */
    @GetMapping("")
    public String showLogin() {
        return "ex-09";
    }

    /**
     * ログイン処理を行うメソッド
     * @param email 入力されたメールアドレス
     * @param pass 入力されたパスワード
     * @param model 結果を格納するModel
     * @return ex-09-result.html というテンプレート名を返す
     */
    @PostMapping("")
    public String login(@RequestParam("email") String email, @RequestParam("pass") String pass, Model model) {
        // メールアドレスとパスワードが一致するか判定
        if (email.equals("abc@gmail.com") && pass.equals("abc")) { // ←メールアドレスの先頭の@を削除
            model.addAttribute("result", "ログインに成功しました");
        } else {
            model.addAttribute("result", "ログインに失敗しました。");
        }
        // 判定結果を表示する画面へ遷移
        return "ex-09-result";
    }
}