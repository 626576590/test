package com.els.common.dao;

import com.els.common.vo.ElsJkFun;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ElsJkFunMapper {
    @Delete({
        "delete from ELS_JK_FUN",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String jkId);

    @Insert({
        "insert into ELS_JK_FUN (JK_ID, JK_NAME, ",
        "JK_STS, FBK1, FBK2, ",
        "FBK3, FBK4, FBK5, ",
        "FBK6, FBK7, FBK8, ",
        "FBK9, FBK10)",
        "values (#{jkId,jdbcType=VARCHAR}, #{jkName,jdbcType=VARCHAR}, ",
        "#{jkSts,jdbcType=CHAR}, #{fbk1,jdbcType=VARCHAR}, #{fbk2,jdbcType=VARCHAR}, ",
        "#{fbk3,jdbcType=VARCHAR}, #{fbk4,jdbcType=VARCHAR}, #{fbk5,jdbcType=VARCHAR}, ",
        "#{fbk6,jdbcType=VARCHAR}, #{fbk7,jdbcType=VARCHAR}, #{fbk8,jdbcType=VARCHAR}, ",
        "#{fbk9,jdbcType=VARCHAR}, #{fbk10,jdbcType=VARCHAR})"
    })
    int insert(ElsJkFun record);

    int insertSelective(ElsJkFun record);

    @Select({
        "select",
        "JK_ID, JK_NAME, JK_STS, FBK1, FBK2, FBK3, FBK4, FBK5, FBK6, FBK7, FBK8, FBK9, ",
        "FBK10",
        "from ELS_JK_FUN",
        "where JK_ID = #{jkId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ElsJkFun selectByPrimaryKey(String jkId);

    int updateByPrimaryKeySelective(ElsJkFun record);

    @Update({
        "update ELS_JK_FUN",
        "set JK_NAME = #{jkName,jdbcType=VARCHAR},",
          "JK_STS = #{jkSts,jdbcType=CHAR},",
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
        "where JK_ID = #{jkId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ElsJkFun record);
}