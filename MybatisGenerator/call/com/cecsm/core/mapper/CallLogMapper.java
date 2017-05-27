package com.cecsm.core.mapper;

import com.cecsm.core.entity.CallLog;

public interface CallLogMapper {
    int deleteByPrimaryKey(Long log_id);

    int insert(CallLog record);

    int insertSelective(CallLog record);

    CallLog selectByPrimaryKey(Long log_id);

    int updateByPrimaryKeySelective(CallLog record);

    int updateByPrimaryKey(CallLog record);
}