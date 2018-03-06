package com.xmtcyx.miniapi.config;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @AUTHOR qyu
 * @ProjectName: shopmgr
 * @Description:
 * @date 2017/6/26
 * @UpdateUser:
 * @UpdateDate:
 * @UpdateRemark:
 * @Copyright: 2017 厦门天成印象信息科技有限公司
 * @versions: 1.0
 */
@Aspect
@Configuration
@Slf4j
public class LogRecordAspect {

    @Pointcut("execution(* com.xmtcyx.fjy.shop.controller.*Controller.* (..))")
    public void execudeService(){

    }

    @Around("execudeService()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        HttpServletRequest request = servletRequestAttributes.getRequest();

        String url = request.getRequestURL().toString();
        String requestMethod = request.getMethod();
        Map<String, String[]> parameterMap = request.getParameterMap();

        MethodSignature methodSignature = (MethodSignature)proceedingJoinPoint.getSignature();
        Method method = methodSignature.getMethod();

        log.info("==============="+url+"请求开始=================");
        log.info("Method: " + method);
        log.info("Request Method: " + requestMethod);
        log.info("Params: " + JSON.toJSONString(parameterMap));

        Object result = proceedingJoinPoint.proceed();
        Object json = JSON.toJSON(result);
        log.info("输出结果："+result);
        log.info("================="+url+"请求结束==========================");
        return result;
    }

}
