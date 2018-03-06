package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.ActType;

public interface ActTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActType record);

    int insertSelective(ActType record);

    ActType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActType record);

    int updateByPrimaryKey(ActType record);
}