package com.cs.frm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deiveehannallazhagappan on 4/10/17.
 */
@RestController
@RequestMapping("conf")
public class ConfigController {
    @Value("${user.name}")
    String name = "World";


    @RequestMapping("/username")
    public String getUsers() {
        return name;
    }
}
