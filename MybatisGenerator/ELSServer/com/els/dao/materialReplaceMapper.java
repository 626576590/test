package com.els.dao;

import com.els.vo.materialReplace;

public interface materialReplaceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(materialReplace record);

    int insertSelective(materialReplace record);

    materialReplace selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(materialReplace record);

    int updateByPrimaryKey(materialReplace record);
}