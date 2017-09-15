package com.handl.spring.dubbo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.handl.spring.dubbo.api.UserService;
import com.handl.spring.dubbo.pojo.User;
import org.springframework.stereotype.Component;


/**
 * Created by handl on 2017/9/15.
 */
@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserr() {
        System.out.println("provider-user-1");
        User user = new User();
        user.setUsername("shierlou@163.com");
        user.setPassword("123456789");
        return user;
    }
}
