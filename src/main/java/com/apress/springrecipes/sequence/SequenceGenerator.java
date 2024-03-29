package com.apress.springrecipes.sequence;

import com.apress.springrecipes.sequence.service.PrefixGenerator;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
//import javax.inject.Inject;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    @Resource
    //@Inject @DatePrefixAnnotation
    private PrefixGenerator prefixGenerator;

    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger();

    public SequenceGenerator() {}

    public SequenceGenerator(PrefixGenerator prefixGenerator, String suffix, int initial) {
        this.prefixGenerator = prefixGenerator;
        this.suffix = suffix;
        this.initial = initial;
    }

    @Required
    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    @Required
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public String getSequence() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefixGenerator.getPrefix())
                .append(initial)
                .append(counter.getAndIncrement())
                .append(suffix);
        return builder.toString();
    }
}
