package com.caihua.service;

import com.caihua.bean.User;
import com.caihua.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

public interface UserService {

    public User findUser(int id);

}
