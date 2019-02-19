package com.zy.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zheng on 2019/2/18.
 */
public class Provider {
    public static void main(String[] args) throws  Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext-dubbo.xml"});
        context.start();
        System.in.read();
    }
}
