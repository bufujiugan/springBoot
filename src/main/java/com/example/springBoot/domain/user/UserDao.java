package com.example.springBoot.domain.user;


public interface UserDao {
    User selectByPrimaryKey(Integer id);
}
