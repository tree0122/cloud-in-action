package com.tree.spring.cloud.action.springboothello.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RocketMQHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return Health.  up().build();
    }


    private int check(){

        return 0;
    }
}
