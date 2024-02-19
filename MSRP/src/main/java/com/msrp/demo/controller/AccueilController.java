package com.msrp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccueilController {

    @RequestMapping("/")
    String PageAccueil(){
        return "index";
    }

}
