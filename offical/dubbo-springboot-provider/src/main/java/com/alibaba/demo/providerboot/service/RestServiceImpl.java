package com.alibaba.demo.providerboot.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.demo.RestService;
import com.alibaba.dubbo.demo.entity.HelloEntity;
import com.alibaba.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;


@Path("demo")
public class RestServiceImpl implements RestService {
    @GET
    @Path("hello/{name}")
    //@Consumes({MediaType.APPLICATION_JSON})    
    @Produces({MediaType.APPLICATION_JSON})    
    public HelloEntity sayHello(@PathParam("name") String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        HelloEntity entity = new HelloEntity();
        entity.setMessage("Hello "+ name);
        entity.setIp(RpcContext.getContext().getLocalAddress().getHostName().toString());
        entity.setPort(RpcContext.getContext().getLocalAddress().getPort());
        return entity;
    }
}