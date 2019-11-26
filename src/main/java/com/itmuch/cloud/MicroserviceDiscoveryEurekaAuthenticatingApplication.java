package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //這是一個server
public class MicroserviceDiscoveryEurekaAuthenticatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryEurekaAuthenticatingApplication.class, args);
	}

}
