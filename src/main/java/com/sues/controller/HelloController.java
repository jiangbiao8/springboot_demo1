package com.sues.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/8 0008.
 */
@RestController
public class HelloController {
    @RequestMapping("/springboot")
    public String HelloWorld(){
        return "Hello,World";
    }
}
