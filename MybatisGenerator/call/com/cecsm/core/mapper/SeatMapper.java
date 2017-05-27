package com.cecsm.core.mapper;

import com.cecsm.core.entity.Seat;

public interface SeatMapper {
    int deleteByPrimaryKey(Long seat_id);

    int insert(Seat record);

    int insertSelective(Seat record);

    Seat selectByPrimaryKey(Long seat_id);

    int updateByPrimaryKeySelective(Seat record);

    int updateByPrimaryKey(Seat record);
}