package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.Usr;

import java.util.List;

public interface UsrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Usr record);

    int insertSelective(Usr record);

    Usr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Usr record);

    int updateByPrimaryKey(Usr record);

    int selectCount();//查询usr的全部条数

    List<Usr> selectAllUsr(); // 查询全部的usr
}