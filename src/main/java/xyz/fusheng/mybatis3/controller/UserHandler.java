/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserHandler
 * Author:   25610
 * Date:     2020/3/1 10:52
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.mybatis3.entity.User;
import xyz.fusheng.mybatis3.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService userService;

    // @GetMapping("/findUserByNameAndUsername/{name}/{username}")
    // public List<User> findUserByNameAndUsername(@PathVariable("name") String name, @PathVariable("username") String username){
    //     return userService.findUserByNameAndUsername(name, username);
    // }
    @GetMapping("/findUserByNameAndUsername")
    public List<User> findUserByNameAndUsername(@RequestBody User user){
        return userService.findUserByNameAndUsername(user);
    }

    @GetMapping("/findUserByNameOrUsernameOrPhone")
    public List<User> findUserByNameOrUsernameOrPhone(@RequestBody User user){
        return userService.findUserByNameOrUsernameOrPhone(user);
    }

    @GetMapping("/findUserByNameAndUsername1")
    public List<User> findUserByNameAndUsername1(@RequestBody User user){
        return userService.findUserByNameAndUsername1(user);
    }

    @GetMapping("/findUserByNameOrUsernameOrPhone1")
    public List<User> findUserByNameOrUsernameOrPhone1(@RequestBody User user){
        return userService.findUserByNameOrUsernameOrPhone1(user);
    }

    @PutMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @GetMapping("/findUserByIds")
    public List<User> findUserByIds(@RequestBody List<Long> ids) {
        return userService.findUserByIds(ids);
    }

    @GetMapping("/findUserByName/{name}")
    public List<User> findUserByName(@PathVariable("name") String name){
        return userService.findUserByName(name);
    }



}
