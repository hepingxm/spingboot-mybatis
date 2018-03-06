package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.ShipCarGoods;

public interface ShipCarGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShipCarGoods record);

    int insertSelective(ShipCarGoods record);

    ShipCarGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShipCarGoods record);

    int updateByPrimaryKey(ShipCarGoods record);
}