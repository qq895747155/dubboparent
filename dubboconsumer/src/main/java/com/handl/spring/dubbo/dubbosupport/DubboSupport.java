package com.handl.spring.dubbo.dubbosupport;

import com.alibaba.dubbo.config.annotation.Reference;
import com.handl.spring.dubbo.api.MhxyService;
import com.handl.spring.dubbo.api.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by handl on 2017/9/16.
 */
@Component
public class DubboSupport {

    @Reference
    public static MhxyService mhxyService;

    @Reference
    public static UserService userService;

//    public MhxyService getMhxyService() {
//        return mhxyService;
//    }
//
//    public UserService getUserService() {
//        return userService;
//    }

}
