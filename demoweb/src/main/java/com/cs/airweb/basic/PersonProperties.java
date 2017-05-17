package com.cs.airweb.basic;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by deiveehannallazhagappan on 5/7/17.
 */

@Component
@ConfigurationProperties(prefix = "person")
public class PersonProperties {

        private String greeting;
        private String farewell;

        public String getGreeting() {
            return greeting;
        }

        public void setGreeting(String greeting) {
            this.greeting = greeting;
        }

        public String getFarewell() {
            return farewell;
        }

        public void setFarewell(String farewell) {
            this.farewell = farewell;
        }

}
