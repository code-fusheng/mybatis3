/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserRepository
 * Author:   25610
 * Date:     2020/3/1 10:53
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis3.repository;

import org.springframework.stereotype.Repository;
import xyz.fusheng.mybatis3.entity.User;

import java.util.List;

@Repository
public interface UserRepository {
    List<User> findUserByNameAndUsername(User user);
    List<User> findUserByNameOrUsernameOrPhone(User user);
    List<User> findUserByNameAndUsername1(User user);
    List<User> findUserByNameOrUsernameOrPhone1(User user);
    int updateUser(User user);
    List<User> findUserByIds(List ids);
    List<User> findUserByName(String name);
}
