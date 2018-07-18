package com.pzlove.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pzlove.pojo.User;
import com.pzlove.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        user.setId(1);
        System.out.println(user.toString());
        return user;
    }
}