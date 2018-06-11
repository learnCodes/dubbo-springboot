package com.alibaba.demo.consumerboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.demo.DemoService;

@RestController
public class HelloWorldController{
    @Autowired
    private DemoService service;
    @RequestMapping("/hello/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        return service.sayHello(name);
    }
}