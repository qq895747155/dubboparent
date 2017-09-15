package com.handl.spring.dubbo.springconfig;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by handl on 2017/5/20.
 *
 <!-- 提供方应用信息，用于计算依赖关系 -->
 <dubbo:application name="hehe_provider" />
 <!-- 使用zookeeper注册中心暴露服务地址 -->
 <dubbo:registry address="zookeeper://127.0.0.1:2181"/>
 <!-- <dubbo:registry address="multicast://224.5.6.7:1234" /> -->
 <!-- 用dubbo协议在20880端口暴露服务 -->
 <dubbo:protocol name="dubbo" port="20880" />
 *
 */
@Configuration
@ComponentScan(basePackages = "com.handl.spring.dubbo")
public class DubboProviderConfig {
    public static final String APPLICATION_NAME = "dubbo-provider-1";

    public static final String REGISTRY_ADDRESS = "zookeeper://127.0.0.1:2181";

    public static final String ANNOTATION_PACKAGE = "com.handl.spring.dubbo.api.impl";

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
        ProtocolConfig protocolConfig=new ProtocolConfig("dubbo",20880);
        protocolConfig.setSerialization("java");//默认为hessian2,但不支持无参构造函数类,而这种方式的效率很低
        return protocolConfig;
    }

    /**
     * 与<dubbo:annotation/>相当.
     * 提供方扫描带有@com.alibaba.dubbo.config.annotation.Service的注解类
     * @return
     */
    @Bean
    public AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(ANNOTATION_PACKAGE);
        return annotationBean;
    }
}
