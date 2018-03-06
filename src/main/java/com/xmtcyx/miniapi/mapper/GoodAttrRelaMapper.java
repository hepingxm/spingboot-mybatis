package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.GoodAttrRela;

public interface GoodAttrRelaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodAttrRela record);

    int insertSelective(GoodAttrRela record);

    GoodAttrRela selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodAttrRela record);

    int updateByPrimaryKey(GoodAttrRela record);
}