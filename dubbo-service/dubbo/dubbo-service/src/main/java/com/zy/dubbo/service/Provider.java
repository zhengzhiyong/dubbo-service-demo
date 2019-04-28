package com.zy.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zheng
 * @date 2019/2/18.
 */
public class Provider {
//    如果使用zookeeper方式暴露服务地址，在需要先开启动zookeeper服务
    public static void main(String[] args) throws  Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext-dubbo.xml"});
        context.start();
        System.in.read();
    }
}
