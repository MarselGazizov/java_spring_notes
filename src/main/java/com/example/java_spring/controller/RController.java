package com.example.java_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "r")
public class RController {

    @GetMapping(value = "rr")
    public String rr(){
        return "Hello";
    }

}
