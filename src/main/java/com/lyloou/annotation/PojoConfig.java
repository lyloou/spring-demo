package com.lyloou.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PojoConfig {

    @Bean
    public Apple apple() {
        Apple apple = new Apple();
        apple.setName("apple22");
        return apple;
    }
}
