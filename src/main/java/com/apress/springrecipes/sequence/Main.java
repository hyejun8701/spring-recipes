package com.apress.springrecipes.sequence;

import com.apress.springrecipes.sequence.config.SequenceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.apress.springrecipes.sequence.repository.SequenceDao;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SequenceConfiguration.class);

        SequenceGenerator sequenceGenerator = context.getBean(SequenceGenerator.class);

        //System.out.println(sequenceDao.getNextValue("IT"));
        //System.out.println(sequenceDao.getNextValue("IT"));
        System.out.println(sequenceGenerator.getSequence());
        System.out.println(sequenceGenerator.getSequence());
    }
}
