package com.abc.dubbo.demo.controller;

import com.abc.dubbo.demo.facade.service.HelloWorldService;
import com.alibaba.dubbo.config.annotation.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Service(interfaceClass = HelloWorldService.class)
@Component
public class HelloController implements HelloWorldService{
    @Value("${server.port}")
    private String port;
	@Override
	public String helloWorld(String name) {
        return "hello "+name+" from spring boot, from port:"+ port;
	}
}