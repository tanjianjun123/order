package com.tz.order.database;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author tanjianjun
 * @create 2019-01-24 13:43
 * 默认情况下，所有的查询都走从库，插入/修改/删除走主库。我们通过方法名来区分操作类型（CRUD）
 */
@Aspect
@Component
public class DataSourceAop {

    @Pointcut("!@annotation(com.tz.order.database.Master) " +
            "&& (execution(* com.tz.order.service..*.select*(..)) " +
            "|| execution(* com.tz.order.service..*.get*(..)))"+
            "|| execution(* com.tz.order.service..*.query*(..)))")
    public void readPointcut() {

    }

    @Pointcut("@annotation(com.tz.order.database.Master) " +
            "|| execution(* com.tz.order.service..*.insert*(..)) " +
            "|| execution(* com.tz.order.service..*.add*(..)) " +
            "|| execution(* com.tz.order.service..*.update*(..)) " +
            "|| execution(* com.tz.order.service..*.edit*(..)) " +
            "|| execution(* com.tz.order.service..*.delete*(..)) " +
            "|| execution(* com.tz.order.service..*.remove*(..))")
    public void writePointcut() {

    }

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }


    /**
     * 另一种写法：if...else...  判断哪些需要读从数据库，其余的走主数据库
     */
//    @Before("execution(* com.tz.order.service.impl.*.*(..))")
//    public void before(JoinPoint jp) {
//        String methodName = jp.getSignature().getName();
//
//        if (StringUtils.startsWithAny(methodName, "get", "select", "find")) {
//            DBContextHolder.slave();
//        }else {
//            DBContextHolder.master();
//        }
//    }
}
