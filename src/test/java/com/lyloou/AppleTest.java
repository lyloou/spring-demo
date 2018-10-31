package com.lyloou;

import com.lyloou.apple.AppleConfig;
import com.lyloou.apple.AppleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppleTest {

    @Test
    public void testService() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppleConfig.class);
        AppleService service = context.getBean(AppleService.class);
        service.printAppleInfo();
    }
}
