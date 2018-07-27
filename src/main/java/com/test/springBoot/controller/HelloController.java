package com.test.springBoot.controller;

import com.yang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yhy
 * @Date: 2018/7/26 11:21
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String helloErvice() {
        String str = helloService.sayHello("leilei");
        return str;
    }

}
