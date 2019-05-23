package com.caihua.service;

import com.caihua.bean.User;
import com.caihua.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public User findUser(int id) {
        return userMapper.findUser(id);
    }
}
