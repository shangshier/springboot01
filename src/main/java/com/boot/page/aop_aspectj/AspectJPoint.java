package com.boot.page.aop_aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * @author shangshanshan
 * @ClassName AspectJPoint
 * @date 2019-11-18 22:05
 * @Description TODO
 */
@Configuration
@Aspect
public class AspectJPoint {

    @Pointcut("this(com.boot.page.aop_aspectj.AopAspectjService)")
    public void thisPoint(){

    }

    @Pointcut("target(com.boot.page.aop_aspectj.AopAspectjService)")
    public void targetPoint(){

    }

    @Around(value = "targetPoint()")
    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("方法执行之前");
        joinPoint.proceed();
        System.out.println("方法执行之后");

    }
}
