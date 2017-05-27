package com.els.common.dao;

import com.els.common.vo.ElsJkConnect;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ElsJkConnectMapper {
    @Delete({
        "delete from ELS_JK_CONNECT",
        "where JK_CONN_ID = #{jkConnId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String jkConnId);

    @Insert({
        "insert into ELS_JK_CONNECT (JK_CONN_ID, JK_TYPE, ",
        "JK_HOST, JK_SYS, JK_CLIENT, ",
        "JK_USER, JK_PASSWD, ",
        "JK_LANG, JK_POOL_CAPACITY, ",
        "JK_PEAK_LIMIT, FBK1, ",
        "FBK2, FBK3, FBK4, ",
        "FBK5, FBK6, FBK7, ",
        "FBK8, FBK9, FBK10)",
        "values (#{jkConnId,jdbcType=VARCHAR}, #{jkType,jdbcType=VARCHAR}, ",
        "#{jkHost,jdbcType=VARCHAR}, #{jkSys,jdbcType=VARCHAR}, #{jkClient,jdbcType=VARCHAR}, ",
        "#{jkUser,jdbcType=VARCHAR}, #{jkPasswd,jdbcType=VARCHAR}, ",
        "#{jkLang,jdbcType=VARCHAR}, #{jkPoolCapacity,jdbcType=INTEGER}, ",
        "#{jkPeakLimit,jdbcType=INTEGER}, #{fbk1,jdbcType=VARCHAR}, ",
        "#{fbk2,jdbcType=VARCHAR}, #{fbk3,jdbcType=VARCHAR}, #{fbk4,jdbcType=VARCHAR}, ",
        "#{fbk5,jdbcType=VARCHAR}, #{fbk6,jdbcType=VARCHAR}, #{fbk7,jdbcType=VARCHAR}, ",
        "#{fbk8,jdbcType=VARCHAR}, #{fbk9,jdbcType=VARCHAR}, #{fbk10,jdbcType=VARCHAR})"
    })
    int insert(ElsJkConnect record);

    int insertSelective(ElsJkConnect record);

    @Select({
        "select",
        "JK_CONN_ID, JK_TYPE, JK_HOST, JK_SYS, JK_CLIENT, JK_USER, JK_PASSWD, JK_LANG, ",
        "JK_POOL_CAPACITY, JK_PEAK_LIMIT, FBK1, FBK2, FBK3, FBK4, FBK5, FBK6, FBK7, FBK8, ",
        "FBK9, FBK10",
        "from ELS_JK_CONNECT",
        "where JK_CONN_ID = #{jkConnId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ElsJkConnect selectByPrimaryKey(String jkConnId);

    int updateByPrimaryKeySelective(ElsJkConnect record);

    @Update({
        "update ELS_JK_CONNECT",
        "set JK_TYPE = #{jkType,jdbcType=VARCHAR},",
          "JK_HOST = #{jkHost,jdbcType=VARCHAR},",
          "JK_SYS = #{jkSys,jdbcType=VARCHAR},",
          "JK_CLIENT = #{jkClient,jdbcType=VARCHAR},",
          "JK_USER = #{jkUser,jdbcType=VARCHAR},",
          "JK_PASSWD = #{jkPasswd,jdbcType=VARCHAR},",
          "JK_LANG = #{jkLang,jdbcType=VARCHAR},",
          "JK_POOL_CAPACITY = #{jkPoolCapacity,jdbcType=INTEGER},",
          "JK_PEAK_LIMIT = #{jkPeakLimit,jdbcType=INTEGER},",
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
        "where JK_CONN_ID = #{jkConnId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ElsJkConnect record);
}