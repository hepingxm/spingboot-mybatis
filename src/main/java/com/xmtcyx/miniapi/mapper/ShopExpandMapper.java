package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.ShopExpand;

public interface ShopExpandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShopExpand record);

    int insertSelective(ShopExpand record);

    ShopExpand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopExpand record);

    int updateByPrimaryKey(ShopExpand record);
}