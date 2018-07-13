package com.alibaba.demo.providerboot.service;

import com.alibaba.dubbo.demo.RestService;
import com.alibaba.dubbo.demo.entity.HelloEntity;
import com.alibaba.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RestServiceImpl implements RestService {
    public HelloEntity testHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        HelloEntity entity = new HelloEntity();
        entity.setMessage("Hello "+ name);
        entity.setIp(RpcContext.getContext().getLocalAddress().getHostName().toString());
        entity.setPort(RpcContext.getContext().getLocalAddress().getPort());
        return entity;
    }
}