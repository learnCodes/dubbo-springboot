package com.alibaba.demo.consumerboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.demo.DemoService;
import com.alibaba.dubbo.demo.RestService;
import com.alibaba.dubbo.demo.entity.HelloEntity;

@RestController
public class HelloWorldController{
    @Autowired
    private DemoService demoService;
    @Autowired
    private RestService restService;
    @RequestMapping("/hello/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }
    @RequestMapping("/rest/{name}")
    public String helloRest(@PathVariable("name") String name) {
        HelloEntity entity = restService.testHello(name);
        return entity.getMessage()+" , from "+entity.getIp()+":"+entity.getPort();
    } 
}