package com.yzit.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//来开启eureka的客户端功能
@MapperScan("com.yzit.project.shop.dao")
public class ShopManagerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopManagerWebApplication.class, args);
	}

}
