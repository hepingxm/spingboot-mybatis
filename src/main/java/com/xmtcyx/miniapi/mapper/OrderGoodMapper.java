package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.OrderGood;

public interface OrderGoodMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderGood record);

    int insertSelective(OrderGood record);

    OrderGood selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderGood record);

    int updateByPrimaryKey(OrderGood record);
}