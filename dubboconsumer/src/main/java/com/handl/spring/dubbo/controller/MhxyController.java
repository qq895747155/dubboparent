package com.handl.spring.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.handl.spring.dubbo.api.MhxyService;
import com.handl.spring.dubbo.dubbosupport.DubboSupport;
import com.handl.spring.dubbo.pojo.Mhxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by handl on 2017/9/15.
 */
@RestController
public class MhxyController {

    @Autowired
    private DubboSupport dubboSupport;

    @RequestMapping("mhxy")
    public String getMhxy(){
        Mhxy mhxy = dubboSupport.mhxyService.getMhxy();
        System.out.println("Mhxy.name="+mhxy.getName()+"\n" +
                "Mhxy.dengji="+mhxy.getDengji()+"\n" +
                "Mhxy.menpai="+mhxy.getMenpai()+"\n" +
                "Mhxy.renwu="+mhxy.getRenwu());

        return "ok";

    }
}
