package com.cecsm.core.mapper;

import com.cecsm.core.entity.CustomerServicePatient;

public interface CustomerServicePatientMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerServicePatient record);

    int insertSelective(CustomerServicePatient record);

    CustomerServicePatient selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerServicePatient record);

    int updateByPrimaryKey(CustomerServicePatient record);
}