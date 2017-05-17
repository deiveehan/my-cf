package com.cs.frm.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by deiveehannallazhagappan on 3/25/17.
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Value("${user.name}")
    String name = "World";

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {

        System.out.println("Config obtained from config server: " + name);
        System.out.println("Getting users");
        return (List<User>) userRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
    public void createUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @RequestMapping("/get/{userID}")
    public User getUser(@PathVariable("userID") String userID) {
        User user = userRepository.findOne(Long.valueOf(userID));
        return user;
    }

    @RequestMapping("/remove/{userID}")
    public String removeUser(@PathVariable("userID") String userID) {
        userRepository.delete(userRepository.findOne(Long.valueOf(userID)));
        return "User Removed";
    }
}