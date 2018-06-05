package com.abc.dubbo.demo.controller;

import com.abc.dubbo.demo.interfaces.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloController implements HelloService{

    private String port;
	@Override
	public String helloWorld(String name) {
        return name;
	}
}