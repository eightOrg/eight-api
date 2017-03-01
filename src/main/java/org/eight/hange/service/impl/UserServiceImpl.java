package org.eight.hange.service.impl;

import org.eight.hange.dao.UserMapper;
import org.eight.hange.pojo.User;
import org.eight.hange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/1.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public User login(User userLogin) {
        return userMapper.login(userLogin);
    }
}
