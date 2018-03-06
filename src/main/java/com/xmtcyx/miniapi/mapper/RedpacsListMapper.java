package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.RedpacsList;

public interface RedpacsListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RedpacsList record);

    int insertSelective(RedpacsList record);

    RedpacsList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RedpacsList record);

    int updateByPrimaryKey(RedpacsList record);
}