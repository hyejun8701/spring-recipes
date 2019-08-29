package com.apress.springrecipes.calculator;

import com.apress.springrecipes.calculator.config.CalculatorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

        /*ArithmeticCalculator arithmeticCalculator = context.getBean("arithmeticCalculator", ArithmeticCalculator.class);
        arithmeticCalculator.add(1,2);
        arithmeticCalculator.sub(4,3);
        arithmeticCalculator.mul(2,3);
        arithmeticCalculator.div(4,2);*/
//        arithmeticCalculator.div(-1,2);

        /*MaxCalculator maxCalculator = (MaxCalculator) arithmeticCalculator;
        maxCalculator.max(1, 2);

        MinCalculator minCalculator = (MinCalculator) arithmeticCalculator;
        minCalculator.min(1, 2);


        UnitCalculator unitCalculator = context.getBean("unitCalculator", UnitCalculator.class);
        unitCalculator.kilogramToPound(10);
        unitCalculator.kilometerToMile(5);

        Counter arithmeticCounter = (Counter) arithmeticCalculator;
        System.out.println(arithmeticCounter.getCount());

        Counter unitCalculatorCounter = (Counter) unitCalculator;
        System.out.println(unitCalculatorCounter.getCount());*/

        //ApplicationContext context = new GenericXmlApplicationContext("appContext.xml");

        ComplexCalculator complexCalculator = context.getBean("complexCalculator", ComplexCalculator.class);
        complexCalculator.add(new Complex(1, 2), new Complex(2,3));
        complexCalculator.sub(new Complex(5, 8), new Complex(2,3));

    }
}
