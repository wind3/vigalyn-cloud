package com.vigalyn.cloud.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class VigalynCloudRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(VigalynCloudRegisterApplication.class, args);
	}
}
