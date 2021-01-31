package com.chenkr.demo.controller;

import com.alibaba.fastjson.JSON;
import com.chenkr.demo.exception.FormException;
import com.chenkr.demo.pojo.User;
import com.chenkr.demo.service.UserService;
import com.chenkr.demo.util.NoSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    NoSQL redis;

    @RequestMapping("/getUser")
    public String getUserByID(String userID) {
        return JSON.toJSONString(userService.getUserByID(userID));
    }

    @RequestMapping("/login")
    public String getUserByID(User user) {
        /**
         * Let's pretend user didn't login twice.
         */
        return JSON.toJSONString(userService.login(user));
    }

    /**
     * required userName and email and userPass
     *
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public String registerUser(User user) {
        Map<String, Object> resultMap = new HashMap<>();
        try {
            resultMap.put("sucess", userService.register(user));
        } catch (DuplicateKeyException e) {
            throw new FormException("Duplicate key", e);
        }
        return JSON.toJSONString(resultMap);
    }


}
