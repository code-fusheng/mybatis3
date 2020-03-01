/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserServiceImpl
 * Author:   25610
 * Date:     2020/3/1 10:53
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.mybatis3.entity.User;
import xyz.fusheng.mybatis3.repository.UserRepository;
import xyz.fusheng.mybatis3.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // @Override
    // public List<User> findUserByNameAndUsername(String name,String username) {
    //     User user = new User();
    //     user.setName(name);
    //     user.setUsername(username);
    //     return userRepository.findUserByNameAndUsername(user);
    // }
    @Override
    public List<User> findUserByNameAndUsername(User user) {
        return userRepository.findUserByNameAndUsername(user);
    }

    @Override
    public List<User> findUserByNameOrUsernameOrPhone(User user) {
        return userRepository.findUserByNameOrUsernameOrPhone(user);
    }

    @Override
    public List<User> findUserByNameAndUsername1(User user) {
        return userRepository.findUserByNameAndUsername1(user);
    }

    @Override
    public List<User> findUserByNameOrUsernameOrPhone1(User user) {
        return userRepository.findUserByNameOrUsernameOrPhone1(user);
    }

    @Override
    public int updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public List<User> findUserByIds(List ids) {
        return userRepository.findUserByIds(ids);
    }

    @Override
    public List<User> findUserByName(String name) {
        return userRepository.findUserByName(name);
    }
}
