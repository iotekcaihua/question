package com.caihua.mapper;

import com.caihua.bean.User;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface UserMapper {
    public User findUser(int id);
}
