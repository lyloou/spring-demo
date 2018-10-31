package com.lyloou;

import com.lyloou.pojo.Role;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class RoleTest {

    @Test
    public void testApp() {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-cfg.xml");
        Role role = context.getBean(Role.class);
        System.out.println(role);
    }
}
