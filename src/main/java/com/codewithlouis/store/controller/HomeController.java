package com.codewithlouis.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController
{
    @RequestMapping("/")
    public String great(){
        return "Hello World!";
    }
    @RequestMapping("/about")
    public String about(){
        return "We dont teach,We Educate";
    }
}
