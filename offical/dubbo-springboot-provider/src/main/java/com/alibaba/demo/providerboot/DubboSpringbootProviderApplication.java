package com.alibaba.demo.providerboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:META-INF/spring/*.xml"})
@SpringBootApplication
public class DubboSpringbootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringbootProviderApplication.class, args);
	}
}
