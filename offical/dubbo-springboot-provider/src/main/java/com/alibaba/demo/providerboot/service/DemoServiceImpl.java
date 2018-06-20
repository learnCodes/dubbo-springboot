package com.alibaba.demo.providerboot.service;

import com.alibaba.dubbo.demo.DemoRequest;
import com.alibaba.dubbo.demo.DemoResponse;
import com.alibaba.dubbo.demo.DemoService;

import org.springframework.beans.factory.annotation.Value;

public class DemoServiceImpl implements DemoService {
    @Value("${server.port}")
    private String port;
    @Value("${app.config.delay}")
    private int delay;
	@Override
	public DemoResponse test(DemoRequest request) {
        try{
            Thread.sleep(delay);
        }catch(Exception e){
        }
        DemoResponse response = new DemoResponse();
        response.setId(request.getId());
        response.setName(request.getName());
        response.setItems(request.getItems());
        response.setPort(port);
		return response;
	}

}