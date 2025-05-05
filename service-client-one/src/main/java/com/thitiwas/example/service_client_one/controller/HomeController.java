package com.thitiwas.example.service_client_one.controller;

import com.thitiwas.example.service_client_one.CloudConfigsServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-one")
public class HomeController {

    private final CloudConfigsServer cloudConfigsServer;

    public HomeController(CloudConfigsServer cloudConfigsServer) {
        this.cloudConfigsServer = cloudConfigsServer;
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello from service-one!");
    }


    @GetMapping("/name")
    public ResponseEntity<String> name() {
        return ResponseEntity.ok("the following value read form config server = " + cloudConfigsServer.getName());
    }
}
