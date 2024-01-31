package com.msrp.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AccueilController {

    @RequestMapping("/")
    String PageAccueil(){
        return "HelloWorld";
    }

}
