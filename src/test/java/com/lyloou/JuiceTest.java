package com.lyloou;

import com.lyloou.juice.JuiceMaker;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class JuiceTest {

    @Test
    public void testApp() {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-cfg.xml");
        JuiceMaker juiceMaker = context.getBean(JuiceMaker.class);
        System.out.println(juiceMaker);
        System.out.println(juiceMaker.makeJuice());
    }
}
