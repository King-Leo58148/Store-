package com.codewithlouis.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/login")
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "Login Success";
    }

}
