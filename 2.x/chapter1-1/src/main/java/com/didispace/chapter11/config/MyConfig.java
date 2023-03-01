package com.didispace.chapter11.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class MyConfig {
    @Bean
    public String hello() {
        return "welcome to configuration class";
    }
}
