package com.example.courseapis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
@GetMapping("/home")
    public String home(){
        return  "hello ritesh get start";
    }
}
