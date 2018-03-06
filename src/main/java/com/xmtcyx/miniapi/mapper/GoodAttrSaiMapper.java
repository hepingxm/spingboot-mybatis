package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.GoodAttrSai;

public interface GoodAttrSaiMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodAttrSai record);

    int insertSelective(GoodAttrSai record);

    GoodAttrSai selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodAttrSai record);

    int updateByPrimaryKey(GoodAttrSai record);
}