package com.cecsm.core.mapper;

import com.cecsm.core.entity.Groups;

public interface GroupsMapper {
    int deleteByPrimaryKey(Long groups_id);

    int insert(Groups record);

    int insertSelective(Groups record);

    Groups selectByPrimaryKey(Long groups_id);

    int updateByPrimaryKeySelective(Groups record);

    int updateByPrimaryKey(Groups record);
}