package com.zhouwei.spring;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Start log:"+joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("End log:"+joinPoint.getSignature().getName());
        return object;
    }
}
