package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.UsrType;

public interface UsrTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UsrType record);

    int insertSelective(UsrType record);

    UsrType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UsrType record);

    int updateByPrimaryKey(UsrType record);
}