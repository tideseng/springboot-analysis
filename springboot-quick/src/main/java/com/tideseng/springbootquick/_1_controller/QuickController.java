package com.tideseng.springbootquick._1_controller;

import com.tideseng.springbootquick.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 * @RestController复合注解，包含了@ResponseBody和@Controller注解
 */
@RestController
public class QuickController {

    @Autowired
    private User user;

    // http://localhost:8088/quick/test  -->  hello: 佳欢
    @RequestMapping("/test")
    public Object quick(){
        return "hello: " + user.getUsername();
    }

}
