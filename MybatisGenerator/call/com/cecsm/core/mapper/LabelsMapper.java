package com.cecsm.core.mapper;

import com.cecsm.core.entity.Labels;

public interface LabelsMapper {
    int deleteByPrimaryKey(Long labels_id);

    int insert(Labels record);

    int insertSelective(Labels record);

    Labels selectByPrimaryKey(Long labels_id);

    int updateByPrimaryKeySelective(Labels record);

    int updateByPrimaryKey(Labels record);
}