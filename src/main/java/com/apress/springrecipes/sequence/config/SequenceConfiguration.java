package com.apress.springrecipes.sequence.config;

import com.apress.springrecipes.sequence.DatePrefixGenerator;
import com.apress.springrecipes.sequence.SequenceGenerator;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class SequenceConfiguration {
    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        DatePrefixGenerator dpg = new DatePrefixGenerator();
        dpg.setPattern("yyyyMMdd");
        return dpg;
    }

    @Bean
    @DependsOn("datePrefixGenerator")
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(100000);
        //sequence.setSuffix("A");
        //sequence.setPrefixGenerator(datePrefixGenerator());
        return sequence;
    }

    @Bean
    public RequiredAnnotationBeanPostProcessor processor () {
        return new RequiredAnnotationBeanPostProcessor() {
            @Override
            protected boolean shouldSkip (ConfigurableListableBeanFactory beanFactory,
                                          String beanName) {
                if (beanName.equals("sequenceGenerator")) {
                    return false;
                }
                return super.shouldSkip(beanFactory, beanName);
            }
        };
    }
}
