package com.els.common.dao;

import com.els.common.vo.ElsJkFunSaveFields;
import com.els.common.vo.ElsJkFunSaveFieldsKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ElsJkFunSaveFieldsMapper {
    @Delete({
        "delete from ELS_JK_FUN_SAVE_FIELDS",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}",
          "and SAVE_TABLE = #{saveTable,jdbcType=VARCHAR}",
          "and FIELD = #{field,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(ElsJkFunSaveFieldsKey key);

    @Insert({
        "insert into ELS_JK_FUN_SAVE_FIELDS (JK_ID, SAVE_TABLE, ",
        "FIELD, IS_UK, FUN_STRUCT, ",
        "FUN_STRUCT_FIELD, DEFAULT_VALUE, ",
        "SPECIAL_TYPE, EXPRESSION, ",
        "FBK1, FBK2, FBK3, ",
        "FBK4, FBK5, FBK6, ",
        "FBK7, FBK8, FBK9, ",
        "FBK10)",
        "values (#{jkId,jdbcType=VARCHAR}, #{saveTable,jdbcType=VARCHAR}, ",
        "#{field,jdbcType=VARCHAR}, #{isUk,jdbcType=CHAR}, #{funStruct,jdbcType=VARCHAR}, ",
        "#{funStructField,jdbcType=VARCHAR}, #{defaultValue,jdbcType=VARCHAR}, ",
        "#{specialType,jdbcType=VARCHAR}, #{expression,jdbcType=VARCHAR}, ",
        "#{fbk1,jdbcType=VARCHAR}, #{fbk2,jdbcType=VARCHAR}, #{fbk3,jdbcType=VARCHAR}, ",
        "#{fbk4,jdbcType=VARCHAR}, #{fbk5,jdbcType=VARCHAR}, #{fbk6,jdbcType=VARCHAR}, ",
        "#{fbk7,jdbcType=VARCHAR}, #{fbk8,jdbcType=VARCHAR}, #{fbk9,jdbcType=VARCHAR}, ",
        "#{fbk10,jdbcType=VARCHAR})"
    })
    int insert(ElsJkFunSaveFields record);

    int insertSelective(ElsJkFunSaveFields record);

    @Select({
        "select",
        "JK_ID, SAVE_TABLE, FIELD, IS_UK, FUN_STRUCT, FUN_STRUCT_FIELD, DEFAULT_VALUE, ",
        "SPECIAL_TYPE, EXPRESSION, FBK1, FBK2, FBK3, FBK4, FBK5, FBK6, FBK7, FBK8, FBK9, ",
        "FBK10",
        "from ELS_JK_FUN_SAVE_FIELDS",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}",
          "and SAVE_TABLE = #{saveTable,jdbcType=VARCHAR}",
          "and FIELD = #{field,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ElsJkFunSaveFields selectByPrimaryKey(ElsJkFunSaveFieldsKey key);

    int updateByPrimaryKeySelective(ElsJkFunSaveFields record);

    @Update({
        "update ELS_JK_FUN_SAVE_FIELDS",
        "set IS_UK = #{isUk,jdbcType=CHAR},",
          "FUN_STRUCT = #{funStruct,jdbcType=VARCHAR},",
          "FUN_STRUCT_FIELD = #{funStructField,jdbcType=VARCHAR},",
          "DEFAULT_VALUE = #{defaultValue,jdbcType=VARCHAR},",
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
          "and SAVE_TABLE = #{saveTable,jdbcType=VARCHAR}",
          "and FIELD = #{field,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ElsJkFunSaveFields record);
}