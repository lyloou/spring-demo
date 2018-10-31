package com.lyloou.role.service.impl;

import com.lyloou.role.pojo.Role;
import com.lyloou.role.service.RoleService;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRoleInfo(Role role) {
        System.out.println("id=" + role.getId());
        System.out.println("name=" + role.getName());
        System.out.println("note=" + role.getNote());
    }
}
