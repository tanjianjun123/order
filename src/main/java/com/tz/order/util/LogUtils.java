package com.tz.order.util;

import org.slf4j.Logger;

/**
 * log自研工具类
 * @author tanjianjun
 * @create 2018-11-26 15:03
 */
public class LogUtils {
    /**
     * 日志记录
     * @param logger
     * @param userId
     * @param operation
     * @param params
     */
    public static void info(Logger logger, String userId, String operation,String params){
        logger.info("操作人："+userId+"--操作事项:"+operation+"--参数:"+params);
    }

    /**
     * 日志记录
     * @param logger
     * @param userId
     * @param operation
     * @param params
     */
    public static void error(Logger logger, String userId, String operation,String params,Exception e){
        logger.error("操作人："+userId+"--操作事项："+operation+"--参数："+params+"--错误是："+e.toString());
    }
}
