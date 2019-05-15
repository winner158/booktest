package com.book.bookManagement.service;

import com.book.entity.User;

/**
 * Created by 史煜 on 2019/4/22.
 * Describe：
 */
public interface UserService {
    public  void addUser(User user);
    public User findByUserName(User user);
    public User findByOpenid(String openid);
}
