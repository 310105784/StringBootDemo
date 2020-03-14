package com.lz.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "Hello ,SpringBoot";
    }

}