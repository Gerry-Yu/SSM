package com.test;

import com.demo.dao.UserDao;
import com.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

/**
 * Created by Pinggang Yu on 2016/10/31.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:conf/spring-config.xml" })

public class UserTest {
    @Autowired
    private UserDao userDao;  //idea (Setting -> Code Style -> inspections-> Spring -> Severiry change to warning)

    @Test
    public void testSelectAllUsers() {
        ArrayList<User> getAllUsers = userDao.selectAllUsers();
        for (User user : getAllUsers) {
            System.out.println(user.toString());
        }
    }
}
