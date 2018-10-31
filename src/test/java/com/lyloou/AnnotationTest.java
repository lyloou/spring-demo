package com.lyloou;

import com.lyloou.annotation.Apple;
import com.lyloou.annotation.PojoConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
    @Test
    public void testAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        Apple apple = context.getBean(Apple.class);
        System.out.println(apple);
    }
}
