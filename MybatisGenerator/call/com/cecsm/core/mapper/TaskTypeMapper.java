package com.cecsm.core.mapper;

import com.cecsm.core.entity.TaskType;

public interface TaskTypeMapper {
    int deleteByPrimaryKey(Long type_id);

    int insert(TaskType record);

    int insertSelective(TaskType record);

    TaskType selectByPrimaryKey(Long type_id);

    int updateByPrimaryKeySelective(TaskType record);

    int updateByPrimaryKey(TaskType record);
}