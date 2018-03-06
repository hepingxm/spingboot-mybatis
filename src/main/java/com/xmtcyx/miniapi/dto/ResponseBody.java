package com.xmtcyx.miniapi.dto;

import lombok.Data;

/**
 * 数据返回封装对象
 * ____   ___.        ________       ___            ___      ._______
 * |   |  |   |     /    ____  ）    /    \        /    \    |  .__    \
 * |   |__|   |     |   | _/  /      |     \      /     |    |  |  \    \
 * |    __    |     |   |___/        |   |\ \    / /|   |    |  |   )    )
 * |   |  |   |     |   |            |   | \ \__/ / |   |    |  |__/    /
 * |___|  |___|     |___|            |___|  \____/  |___|    |._______/
 *
 * @author hp
 * @create 2018-03-06 11:24
 **/
@Data
public class ResponseBody {

    private Integer status; // 基本状态：0是初始状态，即可用状态，1，错误状态；

    private String mes; // 反馈消息

    private Object item; // 反馈数据

}
