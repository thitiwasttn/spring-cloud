package com.thitiwas.example.service_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApiGatewayApplication.class, args);
	}

}
