package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Main {
    @GetMapping("index")
    public String getIndex() {
        return null;
    }
    
}
