package com.els.dao;

import com.els.vo.ContactInfo;

public interface ContactInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContactInfo record);

    int insertSelective(ContactInfo record);

    ContactInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContactInfo record);

    int updateByPrimaryKey(ContactInfo record);
}