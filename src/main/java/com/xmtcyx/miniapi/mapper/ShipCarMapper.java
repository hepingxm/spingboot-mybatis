package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.ShipCar;

public interface ShipCarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShipCar record);

    int insertSelective(ShipCar record);

    ShipCar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShipCar record);

    int updateByPrimaryKey(ShipCar record);
}