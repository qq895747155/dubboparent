resources：
    1.dubbo:dubbo-admin
        直接启动tomcat，访问路径：http://localhost:8191/dubbo-admin-2.5.5/
        用户名密码：root/root

        dubbo.xsd文件是spring的scheam模板，此项目用java配置，不需要

    2.zookeeper：
        直接启动bin目录下的zkServer.cmd

    3.Dubbo-1-master.zip：传统的xml配置的dubbo(spring环境也是xml)


  此项目是maven多模块项目
    1.dubboapi:提供通用接口(包含了实体类，注意实体类需要序列化)

    2.dubboconsumer:消费者
        springconfig：springmvc和dubbo配置
        controller:
        dubbosupport:因为dubbo的@Reference注解与@Controller注解扫描时冲突，
                导致service报空异常，因此加了一层，用来扫描注入dubbo服务接口

        pom.xml：引入dubboapi
    3.dubboprovider1和dubboprovider2:提供者：
        api.impl：接口实现
        springconfig：dubbo配置
        App.java:dubbo服务启动类

        pom.xml：引入dubboapi


