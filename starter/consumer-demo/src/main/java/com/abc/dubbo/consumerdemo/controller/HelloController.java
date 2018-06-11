package com.abc.dubbo.consumerdemo.controller;


import com.abc.dubbo.demo.facade.service.HelloWorldService;
import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @Reference
    private HelloWorldService service;
    @RequestMapping("/hello/{name}")
	public String helloWorld(@PathVariable("name") String name) {
		return service.helloWorld(name);
    }
}