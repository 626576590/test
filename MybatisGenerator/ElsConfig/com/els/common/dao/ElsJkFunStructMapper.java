package com.els.common.dao;

import com.els.common.vo.ElsJkFunStruct;
import com.els.common.vo.ElsJkFunStructKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ElsJkFunStructMapper {
    @Delete({
        "delete from ELS_JK_FUN_STRUCT",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}",
          "and FUN_STRUCT = #{funStruct,jdbcType=VARCHAR}",
          "and FUN_STRUCT_FIELD = #{funStructField,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(ElsJkFunStructKey key);

    @Insert({
        "insert into ELS_JK_FUN_STRUCT (JK_ID, FUN_STRUCT, ",
        "FUN_STRUCT_FIELD, FUN_STRUCT_FIELD_TYPE, ",
        "FUN_PARAM_INPUTNAME, FUN_PARAM_DEFAULT, ",
        "SPECIAL_TYPE, EXPRESSION, ",
        "FBK1, FBK2, FBK3, ",
        "FBK4, FBK5, FBK6, ",
        "FBK7, FBK8, FBK9, ",
        "FBK10)",
        "values (#{jkId,jdbcType=VARCHAR}, #{funStruct,jdbcType=VARCHAR}, ",
        "#{funStructField,jdbcType=VARCHAR}, #{funStructFieldType,jdbcType=VARCHAR}, ",
        "#{funParamInputname,jdbcType=VARCHAR}, #{funParamDefault,jdbcType=VARCHAR}, ",
        "#{specialType,jdbcType=VARCHAR}, #{expression,jdbcType=VARCHAR}, ",
        "#{fbk1,jdbcType=VARCHAR}, #{fbk2,jdbcType=VARCHAR}, #{fbk3,jdbcType=VARCHAR}, ",
        "#{fbk4,jdbcType=VARCHAR}, #{fbk5,jdbcType=VARCHAR}, #{fbk6,jdbcType=VARCHAR}, ",
        "#{fbk7,jdbcType=VARCHAR}, #{fbk8,jdbcType=VARCHAR}, #{fbk9,jdbcType=VARCHAR}, ",
        "#{fbk10,jdbcType=VARCHAR})"
    })
    int insert(ElsJkFunStruct record);

    int insertSelective(ElsJkFunStruct record);

    @Select({
        "select",
        "JK_ID, FUN_STRUCT, FUN_STRUCT_FIELD, FUN_STRUCT_FIELD_TYPE, FUN_PARAM_INPUTNAME, ",
        "FUN_PARAM_DEFAULT, SPECIAL_TYPE, EXPRESSION, FBK1, FBK2, FBK3, FBK4, FBK5, FBK6, ",
        "FBK7, FBK8, FBK9, FBK10",
        "from ELS_JK_FUN_STRUCT",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}",
          "and FUN_STRUCT = #{funStruct,jdbcType=VARCHAR}",
          "and FUN_STRUCT_FIELD = #{funStructField,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ElsJkFunStruct selectByPrimaryKey(ElsJkFunStructKey key);

    int updateByPrimaryKeySelective(ElsJkFunStruct record);

    @Update({
        "update ELS_JK_FUN_STRUCT",
        "set FUN_STRUCT_FIELD_TYPE = #{funStructFieldType,jdbcType=VARCHAR},",
          "FUN_PARAM_INPUTNAME = #{funParamInputname,jdbcType=VARCHAR},",
          "FUN_PARAM_DEFAULT = #{funParamDefault,jdbcType=VARCHAR},",
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
          "and FUN_STRUCT = #{funStruct,jdbcType=VARCHAR}",
          "and FUN_STRUCT_FIELD = #{funStructField,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ElsJkFunStruct record);
}