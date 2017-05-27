package com.els.common.dao;

import com.els.common.vo.ElsJkRelation;
import com.els.common.vo.ElsJkRelationKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ElsJkRelationMapper {
    @Delete({
        "delete from ELS_JK_RELATION",
        "where ELSNO = #{elsno,jdbcType=DECIMAL}",
          "and REQ_CODE = #{reqCode,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(ElsJkRelationKey key);

    @Insert({
        "insert into ELS_JK_RELATION (ELSNO, REQ_CODE, ",
        "JK_CONN_ID, JK_ID, ",
        "FBK1, FBK2, FBK3, ",
        "FBK4, FBK5, FBK6, ",
        "FBK7, FBK8, FBK9, ",
        "FBK10)",
        "values (#{elsno,jdbcType=DECIMAL}, #{reqCode,jdbcType=VARCHAR}, ",
        "#{jkConnId,jdbcType=VARCHAR}, #{jkId,jdbcType=VARCHAR}, ",
        "#{fbk1,jdbcType=VARCHAR}, #{fbk2,jdbcType=VARCHAR}, #{fbk3,jdbcType=VARCHAR}, ",
        "#{fbk4,jdbcType=VARCHAR}, #{fbk5,jdbcType=VARCHAR}, #{fbk6,jdbcType=VARCHAR}, ",
        "#{fbk7,jdbcType=VARCHAR}, #{fbk8,jdbcType=VARCHAR}, #{fbk9,jdbcType=VARCHAR}, ",
        "#{fbk10,jdbcType=VARCHAR})"
    })
    int insert(ElsJkRelation record);

    int insertSelective(ElsJkRelation record);

    @Select({
        "select",
        "ELSNO, REQ_CODE, JK_CONN_ID, JK_ID, FBK1, FBK2, FBK3, FBK4, FBK5, FBK6, FBK7, ",
        "FBK8, FBK9, FBK10",
        "from ELS_JK_RELATION",
        "where ELSNO = #{elsno,jdbcType=DECIMAL}",
          "and REQ_CODE = #{reqCode,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ElsJkRelation selectByPrimaryKey(ElsJkRelationKey key);

    int updateByPrimaryKeySelective(ElsJkRelation record);

    @Update({
        "update ELS_JK_RELATION",
        "set JK_CONN_ID = #{jkConnId,jdbcType=VARCHAR},",
          "JK_ID = #{jkId,jdbcType=VARCHAR},",
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
        "where ELSNO = #{elsno,jdbcType=DECIMAL}",
          "and REQ_CODE = #{reqCode,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ElsJkRelation record);
}