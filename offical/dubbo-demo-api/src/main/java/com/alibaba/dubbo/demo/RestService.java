package com.alibaba.dubbo.demo;
import com.alibaba.dubbo.demo.entity.HelloEntity;

public interface RestService {
    HelloEntity sayHello(String name);
}