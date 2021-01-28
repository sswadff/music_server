package com.chenkr.demo.controller;

import com.chenkr.demo.pojo.User;
import com.chenkr.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public User getUserByID(String userID) {
        return userService.getUserByID(userID);
    }

    @RequestMapping("/login")
    public User getUserByID(User user) {
        System.out.println(user);
        return userService.login(user);
    }


}
