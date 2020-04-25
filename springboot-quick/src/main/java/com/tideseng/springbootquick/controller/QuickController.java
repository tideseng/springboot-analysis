package com.tideseng.springbootquick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {

    // http://localhost:8088/quick/quick  -->  hello: 佳欢
    @RequestMapping("/quick")
    public Object quick(@RequestParam(defaultValue = "佳欢") String name){
        return "hello: " + name;
    }

}
