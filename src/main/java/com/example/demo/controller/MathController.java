package com.example.demo.controller;

import com.example.demo.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class MathController {
    @Autowired
    MathService mathService;

    @GetMapping("/cube")
    public @ResponseBody int cube(@RequestParam int a){
        return mathService.cube(a);
    }

    @GetMapping("/roots")
    public @ResponseBody double roots(@RequestParam double a, @RequestParam double b){
        return mathService.Roots(a,b);
    }

    @GetMapping("/volume")
    public @ResponseBody double volume(@RequestParam double l, @RequestParam double b, @RequestParam double h){
        return mathService.volume(l,b,h);
    }

}
