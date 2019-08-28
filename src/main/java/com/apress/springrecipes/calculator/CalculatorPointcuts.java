package com.apress.springrecipes.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class CalculatorPointcuts {
    //@Pointcut("execution(* *.*(..))")
    @Pointcut("annotation(com.apress.springrecipes.calculator.annotation.LoggingRequired)")
    public void loggingOperation() {}
}
