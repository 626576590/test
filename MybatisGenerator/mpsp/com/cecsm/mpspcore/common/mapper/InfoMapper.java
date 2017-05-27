package com.cecsm.mpspcore.common.mapper;

import com.cecsm.mpspcore.common.entity.Info;

public interface InfoMapper {
    int insert(Info record);

    int insertSelective(Info record);
}