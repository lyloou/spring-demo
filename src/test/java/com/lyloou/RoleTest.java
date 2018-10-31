package com.lyloou;

import com.lyloou.role.ApplicationConfig;
import com.lyloou.role.pojo.Role;
import com.lyloou.role.service.RoleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    @Test
    public void testService() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        RoleService service = context.getBean(RoleService.class);
        service.printRoleInfo(new Role("name1", "note1"));
    }
}
