package com.lyloou;

import com.lyloou.role.pojo.Role;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMybatisTest {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        SqlSessionTemplate template = ctx.getBean(SqlSessionTemplate.class);
        printRole(template, 1L);

        // insert
        Role role = new Role("nameHiHi", "noteHiHi");
        template.insert("com.lyloou.role.mapper.RoleMapper.insertRole", role);
        printRole(template, role.getId());

        // update
        role.setName("nameBiBi");
        template.update("com.lyloou.role.mapper.RoleMapper.updateRole", role);
        printRole(template, role.getId());


        // delete
        template.delete("com.lyloou.role.mapper.RoleMapper.deleteRole", role.getId());
        printRole(template, role.getId());
    }

    // select
    private void printRole(SqlSessionTemplate template, long id) {
        Role o = template.selectOne("com.lyloou.role.mapper.RoleMapper.getRole", id);
        System.out.println("=========================");
        System.out.println(o);
        System.out.println("=========================");
    }
}