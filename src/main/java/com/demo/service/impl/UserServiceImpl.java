package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pinggang Yu on 2016/10/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    public int insertUser(int userId, String userName) {
        return userDao.insertUser(userId, userName);
    }

    public ArrayList<User> getAllUsers() {
        return userDao.selectAllUsers();
    }

    public List<User> getUser(int first, int offset) {
        return userDao.getUser(first, offset);
    }
}
