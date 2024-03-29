package com.apress.springrecipes.shop;

import com.apress.springrecipes.shop.domain.Product;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProductCheckBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Product) {
            String productName = ((Product) bean).getName();
//            System.out.println("In AuditCheckBeanPostProcessor.postProcessBeforeInitialization, "
//                    + "processing Product: " + productName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Product) {
            String productName = ((Product) bean).getName();
//            System.out.println("In AuditCheckBeanPostProcessor.postProcessAfterInitialization, "
//                    + "processing Product: " + productName);
        }
        return bean;
    }
}
