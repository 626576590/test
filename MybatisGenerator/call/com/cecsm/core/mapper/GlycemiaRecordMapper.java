package com.cecsm.core.mapper;

import com.cecsm.core.entity.GlycemiaRecord;

public interface GlycemiaRecordMapper {
    int deleteByPrimaryKey(Long record_id);

    int insert(GlycemiaRecord record);

    int insertSelective(GlycemiaRecord record);

    GlycemiaRecord selectByPrimaryKey(Long record_id);

    int updateByPrimaryKeySelective(GlycemiaRecord record);

    int updateByPrimaryKey(GlycemiaRecord record);
}