package com.demo.myproductrestapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myhello")
public class HelloController {

    @GetMapping("/hello")
    public String sayhello() {
        return "Hello World";
    }
}
