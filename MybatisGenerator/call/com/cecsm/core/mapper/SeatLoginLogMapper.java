package com.cecsm.core.mapper;

import com.cecsm.core.entity.SeatLoginLog;

public interface SeatLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeatLoginLog record);

    int insertSelective(SeatLoginLog record);

    SeatLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeatLoginLog record);

    int updateByPrimaryKey(SeatLoginLog record);
}