package com.chenkr.demo.service.impl;

import com.chenkr.demo.mapper.UserMapper;
import com.chenkr.demo.pojo.User;
import com.chenkr.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByID(String userID) {
        return userMapper.selectUserByID(userID);
    }

    @Override
    public User login(User user) {
        return userMapper.selectUserByLoginParams(user.getUserName(), user.getEmail(), user.getUserPass());
    }

    @Override
    public boolean register(User user) {
        return userMapper.insertUserByRegister(user);
    }


}
