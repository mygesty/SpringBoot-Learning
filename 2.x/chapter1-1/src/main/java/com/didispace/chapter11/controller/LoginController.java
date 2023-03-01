package com.didispace.chapter11.controller;

import com.didispace.chapter11.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {

    @GetMapping("getUserInfo")
    public User getUserInfo() {

        // 获取用户信息
        User userInfo = new User();
        userInfo.setId(1L);
        userInfo.setUsername("admin");
        userInfo.setPassword("123456");
        return userInfo;
    }

    @GetMapping("getUserName")
    public String getUserName() {
        return "admin";
    }
}
