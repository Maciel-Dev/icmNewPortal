package com.icm.IcmPortal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrabalhoController {
    @GetMapping(value="/trabalho")
    public String index(){
        return "trabalhos";
    }
}
