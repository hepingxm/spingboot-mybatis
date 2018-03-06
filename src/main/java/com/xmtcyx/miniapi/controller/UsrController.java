package com.xmtcyx.miniapi.controller;

import com.alibaba.fastjson.JSON;
import com.xmtcyx.miniapi.dto.ResponseBody;
import com.xmtcyx.miniapi.model.Usr;
import com.xmtcyx.miniapi.service.UsrService;
import com.xmtcyx.miniapi.utills.IDKey;
import com.xmtcyx.miniapi.utills.PageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户控制器
 *  ____   ___.        ________       ___            ___      ._______
 * |   |  |   |     /    ____  ）    /    \        /    \    |  .__    \
 * |   |__|   |     |   | _/  /      |     \      /     |    |  |  \    \
 * |    __    |     |   |___/        |   |\ \    / /|   |    |  |   )    )
 * |   |  |   |     |   |            |   | \ \__/ / |   |    |  |__/    /
 * |___|  |___|     |___|            |___|  \____/  |___|    |._______/
 *
 * @author hp
 * @create 2018-03-05 15:14
 **/
@Slf4j
@RestController
@RequestMapping("/")
public class UsrController {

    @Autowired
    UsrService usrService;

    @ApiOperation(value = "添加用户",notes = "将所有参数发送给接口，id初始为0")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "用户账号", required = true, dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "pwd", value = "用户密码", required = true, dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "status", value = "状态", required = false, dataType = "int",paramType = "query"),
    })
    @PostMapping("/usr")
    public ResponseBody addUsr(
                      @RequestParam String account,
                      @RequestParam String pwd,
                      Integer status){
        log.debug(account);
        log.debug(pwd);
        log.debug(status+"");
        Usr usr=new Usr();
        usr.setId(IDKey.getId());
        usr.setAccount(account);
        usr.setPwd(pwd);
        if(null==status){
            status = 0;
        }
        usr.setStatus(status);

        ResponseBody responseBody=new ResponseBody();
        responseBody.setStatus(0);
        responseBody.setMes("数据插入成功");
        responseBody.setItem(usr);

        return responseBody;
    }

    @ApiOperation(value = "查询usr列表",notes = "c为当前页，p为页数")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "c",value = "当前页",required = true,dataType = "int",paramType = "query"),
                    @ApiImplicitParam(name = "p",value = "页数",required = true,dataType = "int",paramType = "query")
            }
    )
    @PostMapping("/allusr")
    public ResponseBody usrPages(int c, int p){
        ResponseBody responseBody=new ResponseBody();
        responseBody.setMes("查询成功");
        responseBody.setStatus(0);
        responseBody.setItem(usrService.findItemByPage(c,p));

        log.info("查询成功："+ JSON.toJSONString(usrService.findItemByPage(c,p)));

        return responseBody;
    }
}
