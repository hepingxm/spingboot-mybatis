package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.GoodImg;

public interface GoodImgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodImg record);

    int insertSelective(GoodImg record);

    GoodImg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodImg record);

    int updateByPrimaryKey(GoodImg record);
}