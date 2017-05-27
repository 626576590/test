package com.cecsm.core.mapper;

import com.cecsm.core.entity.Task;

public interface TaskMapper {
    int deleteByPrimaryKey(Long task_id);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Long task_id);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}