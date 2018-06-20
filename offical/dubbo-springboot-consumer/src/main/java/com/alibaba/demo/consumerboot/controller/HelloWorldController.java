package com.alibaba.demo.consumerboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import com.alibaba.dubbo.demo.DemoItem;
import com.alibaba.dubbo.demo.DemoRequest;
import com.alibaba.dubbo.demo.DemoResponse;
import com.alibaba.dubbo.demo.DemoService;

@RestController
public class HelloWorldController{
    @Autowired
    private DemoService service;
    @RequestMapping("/hello/{name}")
    public DemoResponse helloWorld(@PathVariable("name") String name) {
        DemoRequest request = new DemoRequest();
        request.setId(1);
        request.setName(name);
        request.setData("DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING-DEMO-FOR-A-LONG-STRING");
        DemoItem item1 = new DemoItem("123456789", "Address1");
        DemoItem item2 = new DemoItem("123456789", "Address2");
        DemoItem item3 = new DemoItem("123456789", "Address3");
        ArrayList<DemoItem> items = new ArrayList<DemoItem>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        request.setItems(items);
        return service.test(request);
    }
}