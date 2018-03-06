package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.UsrExpand;

public interface UsrExpandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UsrExpand record);

    int insertSelective(UsrExpand record);

    UsrExpand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UsrExpand record);

    int updateByPrimaryKey(UsrExpand record);
}