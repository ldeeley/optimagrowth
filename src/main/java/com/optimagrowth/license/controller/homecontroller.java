package com.optimagrowth.license.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller{

    @RequestMapping("/greeting")
    public String helloWorld(){
        return "Hello World";
    }

}
