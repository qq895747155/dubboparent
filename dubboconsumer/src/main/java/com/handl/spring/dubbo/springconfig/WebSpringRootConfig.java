package com.handl.spring.dubbo.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by handl on 2017/5/20.
 *
 */

@Configuration

@Import({DubboConsumerConfig.class})
@ComponentScan(basePackages = "com.handl.spring.dubbo")
public class WebSpringRootConfig {
}
