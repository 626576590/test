package com.els.dao;

import com.els.vo.AAEnum;
import org.apache.ibatis.annotations.Param;

public interface AAEnumMapper {
    int deleteByPrimaryKey(@Param("enumType") String enumType, @Param("localeId") String localeId, @Param("enumIndex") Integer enumIndex);

    int insert(AAEnum record);

    int insertSelective(AAEnum record);

    AAEnum selectByPrimaryKey(@Param("enumType") String enumType, @Param("localeId") String localeId, @Param("enumIndex") Integer enumIndex);

    int updateByPrimaryKeySelective(AAEnum record);

    int updateByPrimaryKey(AAEnum record);
}