package com.zy.dubbo.service.impl;

import com.zy.dubbo.service.HelloService;

/**
 * @author zheng
 * @date 2019/2/18.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
