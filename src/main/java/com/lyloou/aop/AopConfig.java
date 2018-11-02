package com.lyloou.aop;

import com.lyloou.role.service.impl.RoleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = {RoleAspect.class, RoleServiceImpl.class})
public class AopConfig {

    @Bean
    public RoleAspect getRoleAspect() {
        return new RoleAspect();
    }
}
