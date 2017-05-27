package com.cecsm.mpspcore.common.mapper;

import com.cecsm.mpspcore.common.entity.Apply;
import org.apache.ibatis.annotations.Param;

public interface ApplyMapper {
    int deleteByPrimaryKey(@Param("request_id") String request_id, @Param("hospital_id") Long hospital_id);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(@Param("request_id") String request_id, @Param("hospital_id") Long hospital_id);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}