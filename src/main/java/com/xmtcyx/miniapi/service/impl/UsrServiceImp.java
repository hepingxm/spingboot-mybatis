package com.xmtcyx.miniapi.service.impl;

import com.github.pagehelper.PageHelper;
import com.xmtcyx.miniapi.mapper.UsrMapper;
import com.xmtcyx.miniapi.model.Usr;
import com.xmtcyx.miniapi.service.UsrService;
import com.xmtcyx.miniapi.utills.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 添加用户服务
 * ____   ___.        ________       ___            ___      ._______
 * |   |  |   |     /    ____  ）    /    \        /    \    |  .__    \
 * |   |__|   |     |   | _/  /      |     \      /     |    |  |  \    \
 * |    __    |     |   |___/        |   |\ \    / /|   |    |  |   )    )
 * |   |  |   |     |   |            |   | \ \__/ / |   |    |  |__/    /
 * |___|  |___|     |___|            |___|  \____/  |___|    |._______/
 *
 * @author hp
 * @create 2018-03-05 16:05
 **/
@Service("usrService")
public class UsrServiceImp implements UsrService {

    @Autowired
    UsrMapper usrMapper;

    @Override
    public List<Usr> getAllUsr() {
        return usrMapper.selectAllUsr();
    }

    @Override
    public Integer getCountUsr() {
        return usrMapper.selectCount();
    }

    @Override
    public PageBean<Usr> findItemByPage(int currentPage, int pageSize) {

        PageHelper.startPage(currentPage,pageSize); // 设置分页信息

        List<Usr> allUsrs = usrMapper.selectAllUsr(); // 全部的usr

        int countUsr = usrMapper.selectCount(); // 总记录数

        PageBean<Usr> pageData = new PageBean<>(currentPage, pageSize, countUsr);

        pageData.setItems(allUsrs);

        return pageData;

    }
}
