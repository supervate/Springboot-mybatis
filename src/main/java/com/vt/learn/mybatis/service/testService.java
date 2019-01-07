package com.vt.learn.mybatis.service;

import com.vt.learn.mybatis.dao.UserDao;
import com.vt.learn.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class testService {
    @Autowired
    private UserDao dao;
    @Autowired
    private testService2 testService2;
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<User> selectUsers1(){
        System.out.println(String.format("1 Thread 名 %s", Thread.currentThread().getName()));
        return selectUsers2();
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<User> selectUsers2(){
        System.out.println(String.format("2 Thread 名 %s", Thread.currentThread().getName()));
        return testService2.selectUsers3();
    }
}
