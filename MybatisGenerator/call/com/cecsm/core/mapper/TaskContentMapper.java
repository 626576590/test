package com.cecsm.core.mapper;

import com.cecsm.core.entity.TaskContent;

public interface TaskContentMapper {
    int deleteByPrimaryKey(Long content_id);

    int insert(TaskContent record);

    int insertSelective(TaskContent record);

    TaskContent selectByPrimaryKey(Long content_id);

    int updateByPrimaryKeySelective(TaskContent record);

    int updateByPrimaryKey(TaskContent record);
}