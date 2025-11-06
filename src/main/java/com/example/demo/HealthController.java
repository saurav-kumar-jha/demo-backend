package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController{

    @GetMapping("/home")
    public String health(){
        return "Hello World..";
    }
}