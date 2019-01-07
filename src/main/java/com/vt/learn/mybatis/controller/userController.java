package com.vt.learn.mybatis.controller;

import com.vt.learn.mybatis.dao.UserDao;
import com.vt.learn.mybatis.dao.testDao;
import com.vt.learn.mybatis.pojo.User;
import com.vt.learn.mybatis.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private testDao testDao;
    @Autowired
    private testService testService;
    @RequestMapping("users")
    public void getUsers(){
        testService.selectUsers1();
    }
}
