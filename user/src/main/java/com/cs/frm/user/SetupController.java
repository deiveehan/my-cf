package com.cs.frm.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deiveehannallazhagappan on 3/25/17.
 */
@RestController
public class SetupController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "setup")
    public String setup() {
        User user1 = new User("Deiveehan", "Nallazhagappan", "deivee", "deivee");
        userRepository.save(user1);

        User user2 = new User("Vasantha", "Devi", "devi", "devi");
        userRepository.save(user2);

        User user3 = new User("Karol", "Stuart", "karol", "karol");
        userRepository.save(user3);
        return "Data created";
    }

    @RequestMapping(value = "clear")
    public String clearData() {
        userRepository.deleteAll();
        return "Setup data removed";
    }


}
