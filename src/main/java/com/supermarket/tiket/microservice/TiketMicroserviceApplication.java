package com.supermarket.tiket.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //service client
public class TiketMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiketMicroserviceApplication.class, args);
	}

}
