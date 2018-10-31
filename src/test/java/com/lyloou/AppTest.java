package com.lyloou;

import com.lyloou.pojo.JuiceMaker;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-cfg.xml");
        JuiceMaker juiceMaker = context.getBean(JuiceMaker.class);
        System.out.println(juiceMaker);
    }
}
