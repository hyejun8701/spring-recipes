package com.apress.springrecipes.sequence;

import com.apress.springrecipes.sequence.config.SequenceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.apress.springrecipes.sequence.repository.SequenceDao;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(SequenceConfiguration.class);
//
//        SequenceGenerator sequenceGenerator = context.getBean(SequenceGenerator.class);

        ApplicationContext context =
                new GenericXmlApplicationContext("appContext.xml");

        SequenceGenerator generator =
                (SequenceGenerator) context.getBean("sequenceGenerator");

        //System.out.println(sequenceDao.getNextValue("IT"));
        //System.out.println(sequenceDao.getNextValue("IT"));
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
    }
}
