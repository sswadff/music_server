package com.chenkr.demo.service;

import com.chenkr.demo.pojo.User;

public interface UserService {
    User getUserByID(String userID);

    User login(User user);

    boolean register(User user);
}
