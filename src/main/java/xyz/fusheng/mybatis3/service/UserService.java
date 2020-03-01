/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserService
 * Author:   25610
 * Date:     2020/3/1 10:53
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis3.service;

import xyz.fusheng.mybatis3.entity.User;

import java.util.List;

public interface UserService {
    // 根据客户姓名
    // List<User> findUserByNameAndUsername(String name, String username);
    List<User> findUserByNameAndUsername(User user);
    // 根据用户姓名或者用户账户名查询用户信息
    List<User> findUserByNameOrUsernameOrPhone(User user);

    List<User> findUserByNameAndUsername1(User user);
    List<User> findUserByNameOrUsernameOrPhone1(User user);

    // 更新用户信息操作
    int updateUser(User user);
    // 根据list id集合查询用户信息
    List<User> findUserByIds(List ids);
    // 根据用户姓名模糊查询
    List<User> findUserByName(String name);

}
