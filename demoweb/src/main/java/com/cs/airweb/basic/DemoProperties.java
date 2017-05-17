package com.cs.airweb.basic;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by deiveehannallazhagappan on 5/7/17.
 */

@Component
@PropertySource("classpath:application.yml")
public @Data class DemoProperties {

    @Value("${demo.secret}")
    private String secret;

    @Value("${demo.number}")

    private int number;
    @Value("${demo.bignumber}")
    private long bignumber;

    @Value("${demo.uuid}")
    private String uuid;

    @Value("${demo.numberLessthan10}")
    private int numberLessthan10;

    @Value("${demo.numberInRange}")
    private int numberInRange;

    @Override
    public String toString() {
        return "DemoProperties{" +
                "secret='" + secret + '\'' +
                ", number=" + number +
                ", bignumber=" + bignumber +
                ", uuid='" + uuid + '\'' +
                ", numberLessthan10=" + numberLessthan10 +
                ", numberInRange=" + numberInRange +
                '}';
    }
}
