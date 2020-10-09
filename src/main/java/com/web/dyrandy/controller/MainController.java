package com.web.dyrandy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MainController {

    @GetMapping("/api/hello")
    public String Hello(){
        return "Hello World. Current Time is: " + new Date() +"\n";
    }
}
