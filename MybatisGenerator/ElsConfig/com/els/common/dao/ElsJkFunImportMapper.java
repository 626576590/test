package com.els.common.dao;

import com.els.common.vo.ElsJkFunImport;
import com.els.common.vo.ElsJkFunImportKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ElsJkFunImportMapper {
    @Delete({
        "delete from ELS_JK_FUN_IMPORT",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}",
          "and FUN_PARAM = #{funParam,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(ElsJkFunImportKey key);

    @Insert({
        "insert into ELS_JK_FUN_IMPORT (JK_ID, FUN_PARAM, ",
        "FUN_PARAM_TYPE, FUN_PARAM_INPUTNAME, ",
        "FUN_PARAM_DEFAULT, VALUE_TYPE, ",
        "SPECIAL_TYPE, EXPRESSION, ",
        "FBK1, FBK2, FBK3, ",
        "FBK4, FBK5, FBK6, ",
        "FBK7, FBK8, FBK9, ",
        "FBK10)",
        "values (#{jkId,jdbcType=VARCHAR}, #{funParam,jdbcType=VARCHAR}, ",
        "#{funParamType,jdbcType=VARCHAR}, #{funParamInputname,jdbcType=VARCHAR}, ",
        "#{funParamDefault,jdbcType=VARCHAR}, #{valueType,jdbcType=VARCHAR}, ",
        "#{specialType,jdbcType=VARCHAR}, #{expression,jdbcType=VARCHAR}, ",
        "#{fbk1,jdbcType=VARCHAR}, #{fbk2,jdbcType=VARCHAR}, #{fbk3,jdbcType=VARCHAR}, ",
        "#{fbk4,jdbcType=VARCHAR}, #{fbk5,jdbcType=VARCHAR}, #{fbk6,jdbcType=VARCHAR}, ",
        "#{fbk7,jdbcType=VARCHAR}, #{fbk8,jdbcType=VARCHAR}, #{fbk9,jdbcType=VARCHAR}, ",
        "#{fbk10,jdbcType=VARCHAR})"
    })
    int insert(ElsJkFunImport record);

    int insertSelective(ElsJkFunImport record);

    @Select({
        "select",
        "JK_ID, FUN_PARAM, FUN_PARAM_TYPE, FUN_PARAM_INPUTNAME, FUN_PARAM_DEFAULT, VALUE_TYPE, ",
        "SPECIAL_TYPE, EXPRESSION, FBK1, FBK2, FBK3, FBK4, FBK5, FBK6, FBK7, FBK8, FBK9, ",
        "FBK10",
        "from ELS_JK_FUN_IMPORT",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}",
          "and FUN_PARAM = #{funParam,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ElsJkFunImport selectByPrimaryKey(ElsJkFunImportKey key);

    int updateByPrimaryKeySelective(ElsJkFunImport record);

    @Update({
        "update ELS_JK_FUN_IMPORT",
        "set FUN_PARAM_TYPE = #{funParamType,jdbcType=VARCHAR},",
          "FUN_PARAM_INPUTNAME = #{funParamInputname,jdbcType=VARCHAR},",
          "FUN_PARAM_DEFAULT = #{funParamDefault,jdbcType=VARCHAR},",
          "VALUE_TYPE = #{valueType,jdbcType=VARCHAR},",
          "SPECIAL_TYPE = #{specialType,jdbcType=VARCHAR},",
          "EXPRESSION = #{expression,jdbcType=VARCHAR},",
          "FBK1 = #{fbk1,jdbcType=VARCHAR},",
          "FBK2 = #{fbk2,jdbcType=VARCHAR},",
          "FBK3 = #{fbk3,jdbcType=VARCHAR},",
          "FBK4 = #{fbk4,jdbcType=VARCHAR},",
          "FBK5 = #{fbk5,jdbcType=VARCHAR},",
          "FBK6 = #{fbk6,jdbcType=VARCHAR},",
          "FBK7 = #{fbk7,jdbcType=VARCHAR},",
          "FBK8 = #{fbk8,jdbcType=VARCHAR},",
          "FBK9 = #{fbk9,jdbcType=VARCHAR},",
          "FBK10 = #{fbk10,jdbcType=VARCHAR}",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}",
          "and FUN_PARAM = #{funParam,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ElsJkFunImport record);
}