package com.handl.spring.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.handl.spring.dubbo.api.UserService;
import com.handl.spring.dubbo.dubbosupport.DubboSupport;
import com.handl.spring.dubbo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by handl on 2017/9/15.
 */
@RestController
public class UserController {

    @Autowired
    private DubboSupport dubboSupport;

    @RequestMapping("user")
    public String getUser(){
        User user = dubboSupport.userService.getUserr();
        System.out.println("username="+user.getUsername()+"\n" +
                "password="+user.getPassword());

        return "ok";
    }
}
