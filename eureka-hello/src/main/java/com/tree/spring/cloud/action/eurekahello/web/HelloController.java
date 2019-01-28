package com.tree.spring.cloud.action.eurekahello.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/hello")
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();
        log.info("hello, host: " + instance.getHost() + ", service_id: " + instance.getServiceId());
        return "Hello World";
    }
}
