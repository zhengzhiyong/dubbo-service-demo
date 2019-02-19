package com.zy.dubbo;

import com.zy.dubbo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zheng on 2019/2/18.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] { "classpath:applicationContext-dubbo.xml"});
    context.start();

    HelloService helloService = (HelloService) context.getBean("helloService");
    String hello = helloService.sayHello("tom");
    System.out.println(hello);
    System.in.read();
}
}
