package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.Token;

public interface TokenMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Token record);

    int insertSelective(Token record);

    Token selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}