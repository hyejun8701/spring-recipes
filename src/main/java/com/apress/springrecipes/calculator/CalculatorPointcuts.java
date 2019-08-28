package com.apress.springrecipes.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class CalculatorPointcuts {
    //@Pointcut("execution(* *.*(..))")
    @Pointcut("@target(com.apress.springrecipes.calculator.annotation.LoggingRequired)")
    public void loggingOperation() {}

    @Pointcut("execution(* *.*(..)) && target(target) && args(a,b)")
    public void parameterPointcut(Object target, double a, double b) {}
}
