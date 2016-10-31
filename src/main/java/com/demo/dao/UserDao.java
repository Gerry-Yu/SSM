package com.demo.dao;

import com.demo.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pinggang Yu on 2016/10/31.
 */
public interface UserDao {
    ArrayList<User> selectAllUsers();
    int insertUser(@Param("userId") int userId, @Param("userName") String userName);
    List<User> getUser(@Param("first") int first, @Param("offset") int offset);
}
