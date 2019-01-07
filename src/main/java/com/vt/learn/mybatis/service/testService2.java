package com.vt.learn.mybatis.service;

import com.vt.learn.mybatis.annotation.dao;
import com.vt.learn.mybatis.dao.UserDao;
import com.vt.learn.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class testService2 {
    @Autowired
    private UserDao dao;

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<User> selectUsers3(){
        System.out.println(String.format("3 Thread 名 %s", Thread.currentThread().getName()));
        return dao.queryUsers();
    }
}
