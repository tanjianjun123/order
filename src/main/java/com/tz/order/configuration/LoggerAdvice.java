package com.tz.order.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 创建日志切面类  用于记录请求参数和时间
 * @author tanjianjun
 * @create 2018-11-19 17:18
 */
@Aspect
@Configuration
public class LoggerAdvice {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     *  //ThreadLocal为每个使用该变量的线程提供独立的变量副本，所以每一个线程都可以独立地改变自己的副本，而不会影响其它线程所对应的副本。
     *     //ThreadLocal 维护变量 避免同步
     *     // 开始时间
     */
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * com.tz.order.controller.*.*(..))")
    public void webLog(){

    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("地址URL : " + request.getRequestURL().toString());
        logger.info("方法HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        logger.info("方法CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("参数ARGS : " + Arrays.toString(joinPoint.getArgs()));
    }
    @Around("webLog()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        // 执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime; logCostTime(point, time);
        startTime.remove();
        return result;
    }


    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("返回结果RESPONSE : " + ret);
    }

    private void logCostTime(ProceedingJoinPoint joinPoint, long time) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        logger.info("类class:"+className+" 方法method:"+methodName + " 耗时cost:"+time+"ms"); }
}