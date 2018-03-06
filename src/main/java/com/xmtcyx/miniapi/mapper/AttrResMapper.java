package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.AttrRes;

public interface AttrResMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AttrRes record);

    int insertSelective(AttrRes record);

    AttrRes selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AttrRes record);

    int updateByPrimaryKey(AttrRes record);
}