package com.vt.learn.mybatis.dao;

import com.vt.learn.mybatis.annotation.dao;
import com.vt.learn.mybatis.pojo.User;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("Select * from user where id = #{id}")
    User queryUser(String id);
    @Select("SELECT * FROM USER")
    List<User> queryUsers();
}
