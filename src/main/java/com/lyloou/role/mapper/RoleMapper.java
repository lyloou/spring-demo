package com.lyloou.role.mapper;

import com.lyloou.role.pojo.Role;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    int insertRole(Role role);

    int deleteRole(Long id);

    int updateRole(Role role);

    Role getRole(@Param("id") Long id);
}
