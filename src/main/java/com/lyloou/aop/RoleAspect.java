package com.lyloou.aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class RoleAspect {
    @Pointcut("execution(* com.lyloou.role.service.impl.RoleServiceImpl.printRoleInfo(..))")
    public void print() {
    }

    @Before("print()")
    public void before(){
        System.out.println("before......");
    }

    @After("print()")
    public void after(){
        System.out.println("after......");
    }

    @AfterReturning("print()")
    public void afterReturning(){
        System.out.println("afterReturning......");
    }

    @AfterThrowing("print()")
    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }
}
