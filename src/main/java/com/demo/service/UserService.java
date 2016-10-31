package com.demo.service;

import com.demo.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pinggang Yu on 2016/10/31.
 */
public interface UserService {
    int insertUser(int userId, String userName);
    ArrayList<User> getAllUsers();
    List<User> getUser(int first, int offset);
}
