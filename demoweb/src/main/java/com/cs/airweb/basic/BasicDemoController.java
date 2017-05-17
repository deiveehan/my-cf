package com.cs.airweb.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deiveehannallazhagappan on 5/6/17.
 */
@RestController
@PropertySource("classpath:application.yml")
public class BasicDemoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${app.name}")
    private String appName;

    @Autowired
    private PersonProperties personProperties;

    @Autowired
    private DemoProperties demoProperties;

   @RequestMapping("/basic")
    public String goWeb() {
       logger.info("hi infor");
       logger.debug("hi debug");
       logger.warn("hi warn");
       logger.error("hi error");

       return "testing Deiveehan in app: " + appName;
    }

    @RequestMapping("/hello/{ownerId}")
    public String findOwner(@PathVariable String ownerId, Model model) {
        return "Hello is : " + ownerId;
    }

    @RequestMapping("/")
    public String goHome() {
        return personProperties.getFarewell() + ": " + demoProperties.toString();
    }
}
