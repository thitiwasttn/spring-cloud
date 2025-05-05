package com.thitiwas.example.service_client_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientOneApplication.class, args);
	}

}
