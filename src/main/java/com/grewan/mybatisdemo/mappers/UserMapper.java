package com.grewan.mybatisdemo.mappers;

import com.grewan.mybatisdemo.domain.User;

import java.util.List;

/**
 * @author: grewan
 * @date: 2016/11/9
 */
public interface UserMapper
{

    public void insertUser(User user);

    public User getUserById(Integer userId);

    public List<User> getAllUsers();

    public void updateUser(User user);

    public void deleteUser(Integer userId);

}