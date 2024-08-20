package com.demo.myproductrestapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mylogin")
public class LoginController {
    @GetMapping("login")
    public String validateUser() {
        return "in validateUser";
    }
}
