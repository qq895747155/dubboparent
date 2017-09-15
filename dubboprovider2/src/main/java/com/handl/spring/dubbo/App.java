package com.handl.spring.dubbo;

import com.handl.spring.dubbo.springconfig.DubboProviderConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(DubboProviderConfig.class);
        com.alibaba.dubbo.container.Main.main(args);
    }
}
