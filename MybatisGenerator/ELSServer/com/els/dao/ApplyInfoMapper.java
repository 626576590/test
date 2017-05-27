package com.els.dao;

import com.els.vo.ApplyInfo;
import org.apache.ibatis.annotations.Param;

public interface ApplyInfoMapper {
    int deleteByPrimaryKey(@Param("elsAccount") String elsAccount, @Param("toElsAccount") String toElsAccount, @Param("applyNumber") String applyNumber);

    int insert(ApplyInfo record);

    int insertSelective(ApplyInfo record);

    ApplyInfo selectByPrimaryKey(@Param("elsAccount") String elsAccount, @Param("toElsAccount") String toElsAccount, @Param("applyNumber") String applyNumber);

    int updateByPrimaryKeySelective(ApplyInfo record);

    int updateByPrimaryKey(ApplyInfo record);
}