package com.lyloou.properties;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class PropertiesBean {
    @Value("${log4j.rootLogger}")
    private String rootLogger = null;

    @Value("${log4j.logger.org.mybatis}")
    private String mybatis = null;

    @Value("${log4j.appender.stdout}")
    private String stdout = null;

    @Value("${log4j.appender.stdout.layout}")
    private String layout = null;

    @Value("${log4j.appender.stdout.layout.ConversionPattern}")
    private String conversionPattern = null;

    @Bean
    @Qualifier("myProperties")
    public Properties property() {
        Properties properties = new Properties();
        properties.setProperty("rootLogger", rootLogger);
        properties.setProperty("mybatis", mybatis);
        properties.setProperty("stdout", stdout);
        properties.setProperty("layout", layout);
        properties.setProperty("conversionPattern", conversionPattern);
        return properties;
    }

}
