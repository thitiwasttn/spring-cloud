package com.thitiwas.example.service_client_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientTwoApplication.class, args);
	}

}
