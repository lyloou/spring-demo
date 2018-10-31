package com.lyloou.properties;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:log4j.properties"})
@ComponentScan
public class PropertiesConfig {
}
