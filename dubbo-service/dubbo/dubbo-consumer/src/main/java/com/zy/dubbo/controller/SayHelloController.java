package com.zy.dubbo.controller;

import com.zy.dubbo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zheng
 * @date 2019/2/18.
 */
@Controller
public class SayHelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(String name) {
        return helloService.sayHello(name);
    }
}
