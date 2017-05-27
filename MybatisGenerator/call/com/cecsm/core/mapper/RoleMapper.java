package com.cecsm.core.mapper;

import com.cecsm.core.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Long role_id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long role_id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}