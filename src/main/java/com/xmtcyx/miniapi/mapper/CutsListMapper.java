package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.CutsList;

public interface CutsListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CutsList record);

    int insertSelective(CutsList record);

    CutsList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CutsList record);

    int updateByPrimaryKey(CutsList record);
}