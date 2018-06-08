package com.alibaba.demo.consumerboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:META-INF/spring/*.xml"})
@SpringBootApplication
public class DubboSpringbootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringbootConsumerApplication.class, args);
	}
}
