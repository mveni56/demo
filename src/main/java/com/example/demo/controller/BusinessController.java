package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.AddService;

@Controller
@RestController
public class BusinessController {

    //AddService addService=new AddService()
    @Autowired
    AddService addService;
   // UserService user;

    @GetMapping("/addition")
    public @ResponseBody long add (@RequestParam long a, @RequestParam long b){
        return addService.add(a,b);
    }

    @GetMapping("/multiplication")
    @ResponseBody
    public String multi(@RequestParam long a,@RequestParam long b){

        return addService.multiple(a,b);

    }

}
