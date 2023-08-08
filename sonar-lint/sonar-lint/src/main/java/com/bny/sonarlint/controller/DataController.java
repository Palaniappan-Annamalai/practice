package com.bny.sonarlint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping
    public String getSum(@RequestParam("A") Integer a, @RequestParam("B") Integer b){
     System.out.println("Aish");
     return "";
    }
}
