package com.cecsm.core.mapper;

import com.cecsm.core.entity.Followup;

public interface FollowupMapper {
    int deleteByPrimaryKey(Long followup_id);

    int insert(Followup record);

    int insertSelective(Followup record);

    Followup selectByPrimaryKey(Long followup_id);

    int updateByPrimaryKeySelective(Followup record);

    int updateByPrimaryKey(Followup record);
}