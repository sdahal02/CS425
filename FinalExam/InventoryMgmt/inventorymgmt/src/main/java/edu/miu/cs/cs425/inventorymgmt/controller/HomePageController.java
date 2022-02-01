package edu.miu.cs.cs425.inventorymgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/", "/inventorymgmt"})
public class HomePageController {

    @GetMapping(value = {"/", "/home"})
    public String displayHomePage(){
        return "home/index";
    }
}

