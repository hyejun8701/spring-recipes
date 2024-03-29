package com.apress.springrecipes.calculator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.apress.springrecipes.calculator")
public class CalculatorConfiguration {
}
