package com.lyloou;

import com.lyloou.annotation.Apple;
import com.lyloou.annotation.PojoConfig;
import com.lyloou.apple.AppleConfig;
import com.lyloou.apple.AppleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppleTest {
    @Test
    public void testAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        Apple apple = context.getBean(Apple.class);
        System.out.println(apple);
    }


    @Test
    public void testService2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppleConfig.class);
        AppleService service = context.getBean(AppleService.class);
        service.printAppleInfo();
    }
}
