package com.els.common.dao;

import com.els.common.vo.ElsJkFunSave;
import com.els.common.vo.ElsJkFunSaveKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ElsJkFunSaveMapper {
    @Delete({
        "delete from ELS_JK_FUN_SAVE",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}",
          "and SAVE_TABLE = #{saveTable,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(ElsJkFunSaveKey key);

    @Insert({
        "insert into ELS_JK_FUN_SAVE (JK_ID, SAVE_TABLE, ",
        "FBK1, FBK2, FBK3, ",
        "FBK4, FBK5, FBK6, ",
        "FBK7, FBK8, FBK9, ",
        "FBK10)",
        "values (#{jkId,jdbcType=VARCHAR}, #{saveTable,jdbcType=VARCHAR}, ",
        "#{fbk1,jdbcType=VARCHAR}, #{fbk2,jdbcType=VARCHAR}, #{fbk3,jdbcType=VARCHAR}, ",
        "#{fbk4,jdbcType=VARCHAR}, #{fbk5,jdbcType=VARCHAR}, #{fbk6,jdbcType=VARCHAR}, ",
        "#{fbk7,jdbcType=VARCHAR}, #{fbk8,jdbcType=VARCHAR}, #{fbk9,jdbcType=VARCHAR}, ",
        "#{fbk10,jdbcType=VARCHAR})"
    })
    int insert(ElsJkFunSave record);

    int insertSelective(ElsJkFunSave record);

    @Select({
        "select",
        "JK_ID, SAVE_TABLE, FBK1, FBK2, FBK3, FBK4, FBK5, FBK6, FBK7, FBK8, FBK9, FBK10",
        "from ELS_JK_FUN_SAVE",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}",
          "and SAVE_TABLE = #{saveTable,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ElsJkFunSave selectByPrimaryKey(ElsJkFunSaveKey key);

    int updateByPrimaryKeySelective(ElsJkFunSave record);

    @Update({
        "update ELS_JK_FUN_SAVE",
        "set FBK1 = #{fbk1,jdbcType=VARCHAR},",
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
          "and SAVE_TABLE = #{saveTable,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ElsJkFunSave record);
}