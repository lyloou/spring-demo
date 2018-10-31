package com.lyloou;

import com.lyloou.properties.PropertiesConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PropertiesConfig.class)
public class PropertiesTest {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PropertiesConfig.class);
        String rootLogger = context.getEnvironment().getProperty("log4j.rootLogger");

        System.out.println("==================================");
        System.out.println(rootLogger);
        System.out.println("==================================");
    }

    @Autowired
    @Qualifier("myProperties")
    Properties properties;

    @Test
    public void testProperties() {
        System.out.println("==================================");
        System.out.println(properties.getProperty("rootLogger"));
        System.out.println(properties.getProperty("mybatis"));
        System.out.println(properties.getProperty("stdout"));
        System.out.println(properties.getProperty("layout"));
        System.out.println(properties.getProperty("conversionPattern"));
        System.out.println("==================================");
    }
}
