package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.ActorGanizer;

public interface ActorGanizerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActorGanizer record);

    int insertSelective(ActorGanizer record);

    ActorGanizer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActorGanizer record);

    int updateByPrimaryKey(ActorGanizer record);
}