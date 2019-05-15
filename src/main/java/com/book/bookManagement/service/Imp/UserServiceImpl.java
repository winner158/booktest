package com.book.bookManagement.service.Imp;


import com.book.bookManagement.dao.UserDao;
import com.book.entity.User;
import com.book.bookManagement.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public User findByUserName(User user) {
        User u = userDao.findByUserName(user);
        return u;
    }

    public User findByOpenid(String openid){
        User user = userDao.findByOpenid(openid);
        return user;
    }
}
