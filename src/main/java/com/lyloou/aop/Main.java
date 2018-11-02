package com.lyloou.aop;

import com.lyloou.role.pojo.Role;
import com.lyloou.role.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        RoleService service = context.getBean(RoleService.class);
        service.printRoleInfo(new Role("role_name_1", "note_1"));
    }
}
