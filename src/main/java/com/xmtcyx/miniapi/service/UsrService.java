package com.xmtcyx.miniapi.service;

import com.xmtcyx.miniapi.model.Usr;
import com.xmtcyx.miniapi.utills.PageBean;

import java.util.List;

public interface UsrService {

    List<Usr> getAllUsr();//获取全部的用户

    Integer getCountUsr();//获取用户总条数

    PageBean<Usr> findItemByPage(int currentPage, int pageSize); // 分页查询

}
