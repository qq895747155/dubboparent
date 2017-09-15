package com.handl.spring.dubbo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.handl.spring.dubbo.api.MhxyService;
import com.handl.spring.dubbo.pojo.Mhxy;
import org.springframework.stereotype.Component;


/**
 * Created by handl on 2017/9/15.
 */
@Component
@Service
public class MhxyServiceImpl implements MhxyService {
    @Override
    public Mhxy getMhxy() {
        System.out.println("provider-mhxy-1");
        Mhxy mhxy = new Mhxy();
        mhxy.setName("shierlou");
        mhxy.setDengji(109);
        mhxy.setMenpai("dt");
        mhxy.setRenwu("xiaoyaosheng");
        return mhxy;
    }
}
