package com.example.springbootcodedemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.springbootcodedemo.bo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: demo
 * @Author: mj.liao
 * @Date: 2021/1/26 17:58
 * @Version: 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/sayHello")
    @ResponseBody
    public User sayHello() {
        User user = new User();
        user.setId(1);
        user.setUsername("测试");
        user.setPassword("123456789");
        return user;
    }

}
