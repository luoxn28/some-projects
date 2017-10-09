package com.luo.aspect;

import com.luo.component.HelloWorld;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Hello AOP类
 */
@Aspect
@Component
public class HelloAspect {

    @Autowired
    HelloWorld helloWorld;

    @Before("execution(* com.luo.component.HelloWorld.*(..))")
    public void beforeAdvice(JoinPoint point) {
        String methodName = point.getSignature().getName();
        System.out.println("beforeAdvice: " + methodName);
    }

    @After("execution(* com.luo.component.HelloWorld.*(..))")
    public void afterAdvice(JoinPoint point) {
        String methodName = point.getSignature().getName();
        System.out.println("afterAdvice: " + methodName);
    }

    @AfterThrowing("execution(* com.luo.component.HelloWorld.*(..))")
    public void afterThrowingAdvice(JoinPoint point) {
        String methodName = point.getSignature().getName();
        System.out.println("afterThrowingAdvice: " + methodName);
    }

    @AfterReturning("execution(* com.luo.component.HelloWorld.*(..))")
    public void afterReturningAdvice(JoinPoint point) {
        String methodName = point.getSignature().getName();
        System.out.println("afterReturningAdvice: " + methodName);
    }

    @Around("execution(* com.luo.component.HelloWorld.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint point) {
        Object result = null;

        // 环绕通知（前通知）
        System.out.println("aroundAdvice start...");
        try {
            // 前置通知
            result = point.proceed(); // 目标方法执行
        } catch (Throwable throwable) {
            // 异常通知
            throwable.printStackTrace();
        }
        // 环绕通知（后通知）
        System.out.println("aroundAdvice end...");
        // 后置通知
        // 返回通知

        return result;
    }

}
