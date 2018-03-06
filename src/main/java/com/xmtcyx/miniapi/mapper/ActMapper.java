package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.Act;

public interface ActMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Act record);

    int insertSelective(Act record);

    Act selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Act record);

    int updateByPrimaryKey(Act record);
}