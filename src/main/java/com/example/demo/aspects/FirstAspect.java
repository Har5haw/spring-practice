package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FirstAspect {

    @Pointcut("execution(void com.example.demo.mvc.CustomerController.initBinder(*))")
    public void initBinder(){

    }

    @Pointcut("execution(* com.example.demo.mvc.CustomerController.*(..)) && !initBinder()")
    public void methodsExceptInitBinder(){

    }

    @Before("methodsExceptInitBinder()")
    public void beforeAspect(JoinPoint joinPoint){
        System.out.println("-------> This is before method @Before: "+joinPoint.getSignature());
    }

    @AfterReturning(pointcut = "execution(String com.example.demo.mvc.CustomerController.*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, String result){
        System.out.println("-------> returned to @AfterReturn "+joinPoint.getSignature()+" : "+result);
    }

    @Around("methodsExceptInitBinder()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        try{
            Object result = proceedingJoinPoint.proceed();
            if (result instanceof String){
                String tmp = (String) result;
                if (!tmp.contains("-")){
                    tmp+="-form";
                }
                return tmp;
            }
            return result;
        } catch (Throwable throwable) {
            return "error-page";
        }
    }

    @AfterThrowing(pointcut = "methodsExceptInitBinder()",
            throwing = "throwable")
    public void afterThrow(JoinPoint joinPoint, Throwable throwable){
        System.out.println("-------> returned to @AfterThrowing  "+joinPoint.getSignature()+": "+throwable.getMessage());
    }

}
