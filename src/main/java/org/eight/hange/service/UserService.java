package org.eight.hange.service;

import org.eight.hange.pojo.User;

/**
 * Created by Administrator on 2017/3/1.
 */
public interface UserService {
    User getUserById(int userId);

    User login(User userLogin);
}
