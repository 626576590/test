package com.cecsm.core.mapper;

import com.cecsm.core.entity.Patient;

public interface PatientMapper {
    int deleteByPrimaryKey(Long patient_id);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(Long patient_id);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKeyWithBLOBs(Patient record);

    int updateByPrimaryKey(Patient record);
}