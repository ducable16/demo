package com.something.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String showHome() {
        return "Hello";
    }

    @GetMapping("/systems")
    public String showAdmin() {
        return "Admin page";
    }
}
