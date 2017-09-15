package com.handl.spring.dubbo.springconfig;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by handl on 2017/9/15.
 */
@Configuration
public class DubboConsumerConfig {

    public static final String APPLICATION_NAME = "dubbo-consumer";

    public static final String REGISTRY_ADDRESS = "zookeeper://127.0.0.1:2181";

    public static final String ANNOTATION_PACKAGE = "com.handl.spring.dubbo.dubbosupport";


    /**
     * 与<dubbo:annotation/>相当.
     * 提供方扫描带有@com.alibaba.dubbo.config.annotation.Reference的注解类
     * @return
     */
    @Bean
    public static AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(ANNOTATION_PACKAGE);
        return annotationBean;
    }

    /**
     * 与<dubbo:application/>相当
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(APPLICATION_NAME);
        return applicationConfig;
    }

    /**
     * 与<dubbo:registry/>相当
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(REGISTRY_ADDRESS);
        return registryConfig;
    }

    /**
     * 与<dubbo:protocol/>相当
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig=new ProtocolConfig("dubbo",20882);
        protocolConfig.setSerialization("java");//默认为hessian2,但不支持无参构造函数类,而这种方式的效率很低
        return protocolConfig;
    }

}
