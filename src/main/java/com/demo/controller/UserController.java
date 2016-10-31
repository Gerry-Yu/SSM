package com.demo.controller;

import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pinggang Yu on 2016/10/31.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getUser")
    @ResponseBody
    int getUser(int userId, String userName) {

        try{
            return userService.insertUser(userId,userName);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @RequestMapping("getUsers")
    @ResponseBody
    Map getUsers(int pageSize, int pageNumber) {
        System.out.println(pageSize + " " + pageNumber);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();

        int first = (pageNumber - 1 ) * pageSize;

        hashMap.put("rows", userService.getUser(first, pageSize));
        hashMap.put("total", 21);
        return hashMap;
    }
}

