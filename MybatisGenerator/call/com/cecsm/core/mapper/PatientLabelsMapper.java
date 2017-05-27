package com.cecsm.core.mapper;

import com.cecsm.core.entity.PatientLabels;

public interface PatientLabelsMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(PatientLabels record);

    int insertSelective(PatientLabels record);

    PatientLabels selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(PatientLabels record);

    int updateByPrimaryKey(PatientLabels record);
}