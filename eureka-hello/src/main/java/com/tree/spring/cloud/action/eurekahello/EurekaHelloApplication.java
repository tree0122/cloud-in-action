package com.tree.spring.cloud.action.eurekahello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHelloApplication.class, args);
    }

}

