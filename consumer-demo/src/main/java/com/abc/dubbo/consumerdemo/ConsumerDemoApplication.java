package com.abc.dubbo.consumerdemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerDemoApplication.class, args);
	}
}
