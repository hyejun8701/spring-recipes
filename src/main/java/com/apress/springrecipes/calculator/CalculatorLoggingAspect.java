package com.apress.springrecipes.calculator;

import org.aopalliance.intercept.Joinpoint;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CalculatorLoggingAspect {
    private Logger log = LoggerFactory.getLogger(this.getClass());

//    @Pointcut("execution(* *.*(..))")
//    private void loggingOperation() {}

//    @Before("CalculatorPointcuts.loggingOperation()")
//    public void logBefore(JoinPoint joinPoint) {
//        log.info("The method " + joinPoint.getSignature().getName()
//        + "() begins with " + Arrays.toString(joinPoint.getArgs()));
//    }
//
//    @After("CalculatorPointcuts.loggingOperation()")
//    public void logAfter(JoinPoint joinPoint) {
//        log.info("The method " + joinPoint.getSignature().getName()
//        + "() ends");
//    }
//
//    @AfterReturning(pointcut = "CalculatorPointcuts.loggingOperation()", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//        log.info("The method {}() ends with {}", joinPoint.getSignature().getName(), result);
//    }
//
//    @AfterThrowing(pointcut = "CalculatorPointcuts.loggingOperation()", throwing = "e")
//    public void logAfterThrowing(JoinPoint joinPoint, IllegalArgumentException e) {
//        log.error("Illegal argument {} in {}()", Arrays.toString(joinPoint.getArgs()), joinPoint.getSignature().getName());
//    }
//
//    @Around("CalculatorPointcuts.loggingOperation()")
//    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
//        log.info("The method {}() begins with {}", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
//
//        try {
//            Object result = joinPoint.proceed();
//            log.info("The method {}() ends with ", joinPoint.getSignature().getName(), result);
//            return result;
//        } catch (IllegalArgumentException e) {
//            log.error("Illegal argument {} in {}()", Arrays.toString(joinPoint.getArgs()), joinPoint.getSignature().getName());
//            throw e;
//        }
//    }

//    @Before("execution(* *.*(..))")
//    public void logJoinPoint(JoinPoint joinPoint) {
//        log.info("Join point kind : {}", joinPoint.getKind());
//        log.info("Signature declaring type : {}", joinPoint.getSignature().getDeclaringType());
//        log.info("Signature name : {}", joinPoint.getSignature().getName());
//        log.info("Arguments : {}", Arrays.toString(joinPoint.getArgs()));
//        log.info("Target class : {}", joinPoint.getTarget().getClass().getName());
//        log.info("This class : {}", joinPoint.getThis().getClass().getName());
//    }

    //@Before("execution(* *.*(..)) && target(target) && args(a,b)")
    @Before("CalculatorPointcuts.parameterPointcut(target, a, b)")
    public void logParameter(Object target, double a, double b) {
        log.info("Target class : " + target.getClass().getName());
        log.info("Arguments : " + a + ", " + b);
    }
}
