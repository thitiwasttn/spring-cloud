package com.thitiwas.example.service_client_one;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Getter
@RefreshScope
@Configuration
public class CloudConfigsServer {
    @Value("${my-config.name: default value}")
    private String name;
    @Value("${my-config.example-value: default value}")
    private String exampleValue;

}
