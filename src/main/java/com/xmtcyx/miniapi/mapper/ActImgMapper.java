package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.ActImg;

public interface ActImgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActImg record);

    int insertSelective(ActImg record);

    ActImg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActImg record);

    int updateByPrimaryKey(ActImg record);
}