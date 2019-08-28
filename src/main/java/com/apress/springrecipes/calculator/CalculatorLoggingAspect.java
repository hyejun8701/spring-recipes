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
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Join;
import java.util.Arrays;

@Aspect
@Component
public class CalculatorLoggingAspect implements Ordered {
    private Logger log = LoggerFactory.getLogger(this.getClass());

//    @Before("execution(* *.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        log.info("The method " + joinPoint.getSignature().getName()
//        + "() begins with " + Arrays.toString(joinPoint.getArgs()));
//    }
//
//    @After("execution(* *.*(..))")
//    public void logAfter(JoinPoint joinPoint) {
//        log.info("The method " + joinPoint.getSignature().getName()
//        + "() ends");
//    }
//
//    @AfterReturning(pointcut = "execution(* *.*(..))", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//        log.info("The method {}() ends with {}", joinPoint.getSignature().getName(), result);
//    }
//
//    @AfterThrowing(pointcut = "execution(* *.*(..))", throwing = "e")
//    public void logAfterThrowing(JoinPoint joinPoint, IllegalArgumentException e) {
//        log.error("Illegal argument {} in {}()", Arrays.toString(joinPoint.getArgs()), joinPoint.getSignature().getName());
//    }

//    @Around("execution(* *.*(..))")
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

    @Before("execution(* *.*(..))")
    public void logJoinPoint(JoinPoint joinPoint) {
        log.info("Join point kind : {}", joinPoint.getKind());
        log.info("Signature declaring type : {}", joinPoint.getSignature().getDeclaringType());
        log.info("Signature name : {}", joinPoint.getSignature().getName());
        log.info("Arguments : {}", Arrays.toString(joinPoint.getArgs()));
        log.info("Target class : {}", joinPoint.getTarget().getClass().getName());
        log.info("This class : {}", joinPoint.getThis().getClass().getName());
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
