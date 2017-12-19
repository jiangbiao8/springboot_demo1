package com.sues.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_World {
         @RequestMapping("/")
        public  String say(){
            return "Hello World ";
    }
    @RequestMapping("/hello/{myName}")
    public String index(@PathVariable String myName){
          return "Hello "+myName+"!!!";

    }

}
