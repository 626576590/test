package com.cecsm.core.mapper;

import com.cecsm.core.entity.KnowledgeMessage;

public interface KnowledgeMessageMapper {
    int deleteByPrimaryKey(Long message_id);

    int insert(KnowledgeMessage record);

    int insertSelective(KnowledgeMessage record);

    KnowledgeMessage selectByPrimaryKey(Long message_id);

    int updateByPrimaryKeySelective(KnowledgeMessage record);

    int updateByPrimaryKeyWithBLOBs(KnowledgeMessage record);

    int updateByPrimaryKey(KnowledgeMessage record);
}