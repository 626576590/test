package com.cecsm.mpspcore.common.mapper;

import com.cecsm.mpspcore.common.entity.patient;

public interface patientMapper {
    int deleteByPrimaryKey(Long patient_id);

    int insert(patient record);

    int insertSelective(patient record);

    patient selectByPrimaryKey(Long patient_id);

    int updateByPrimaryKeySelective(patient record);

    int updateByPrimaryKey(patient record);
}