package com.cs.airweb.basic;

import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deiveehannallazhagappan on 5/7/17.
 */
@RestController
public class MetricsController {


        private final CounterService counterService;

        public MetricsController(CounterService counterService){
            this.counterService = counterService;
        }

        @GetMapping("/custmetrics")
        public String hello() {
            counterService.increment("counter.services.greeting.invoked");
            return "Hello World!!!";
        }
    }