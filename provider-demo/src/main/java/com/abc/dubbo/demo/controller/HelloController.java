package com.abc.dubbo.demo.controller;

import com.abc.dubbo.demo.interfaces.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0",
application = "${dubbo.application.id}",
protocol = "${dubbo.protocol.id}",
registry = "${dubbo.registry.id}")
public class HelloController implements HelloService{

    private String port;
	@Override
	public String helloWorld(String name) {
        return name;
	}
}