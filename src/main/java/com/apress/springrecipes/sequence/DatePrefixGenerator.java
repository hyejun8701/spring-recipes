package com.apress.springrecipes.sequence;

import com.apress.springrecipes.sequence.service.PrefixGenerator;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*@Component
@Primary*/
@DatePrefixAnnotation
public class DatePrefixGenerator implements PrefixGenerator {
    private DateFormat formatter;

    public void setPattern(String pattern) {
        formatter = new SimpleDateFormat("yyyyMMdd");
    }

    @Override
    public String getPrefix() {
        return formatter.format(new Date());
    }
}
