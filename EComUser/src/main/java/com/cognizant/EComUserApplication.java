package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.cognizant")
@EnableDiscoveryClient
@SpringBootApplication
public class EComUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EComUserApplication.class, args);
	}

}
