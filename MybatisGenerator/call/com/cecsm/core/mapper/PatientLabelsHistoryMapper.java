package com.cecsm.core.mapper;

import com.cecsm.core.entity.PatientLabelsHistory;

public interface PatientLabelsHistoryMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(PatientLabelsHistory record);

    int insertSelective(PatientLabelsHistory record);

    PatientLabelsHistory selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(PatientLabelsHistory record);

    int updateByPrimaryKey(PatientLabelsHistory record);
}