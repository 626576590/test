package com.els.dao;

import com.els.vo.ApplyInfoFile;
import org.apache.ibatis.annotations.Param;

public interface ApplyInfoFileMapper {
    int deleteByPrimaryKey(@Param("elsAccount") String elsAccount, @Param("toElsAccount") String toElsAccount, @Param("fileNumber") String fileNumber);

    int insert(ApplyInfoFile record);

    int insertSelective(ApplyInfoFile record);

    ApplyInfoFile selectByPrimaryKey(@Param("elsAccount") String elsAccount, @Param("toElsAccount") String toElsAccount, @Param("fileNumber") String fileNumber);

    int updateByPrimaryKeySelective(ApplyInfoFile record);

    int updateByPrimaryKey(ApplyInfoFile record);
}