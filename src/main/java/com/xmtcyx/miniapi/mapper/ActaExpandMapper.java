package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.ActaExpand;

public interface ActaExpandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActaExpand record);

    int insertSelective(ActaExpand record);

    ActaExpand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActaExpand record);

    int updateByPrimaryKey(ActaExpand record);
}