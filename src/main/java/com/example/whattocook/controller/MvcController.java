package com.example.whattocook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController {


    @GetMapping
    public String landingPage(){
        return"I am landing page";
    }

    @PostMapping
    public String
}