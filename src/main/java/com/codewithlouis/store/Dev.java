package com.codewithlouis.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Dev {
//    @Autowired //field injection
    private Laptop laptop;
    //constructor injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
    public void build(){
        laptop.compile();
        System.out.println("Working on Awesome Project");

    }
}
