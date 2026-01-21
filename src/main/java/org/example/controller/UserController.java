package org.example.controller;

import org.example.pojo.Result;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username, String password) {

        //查询用户名有无重复
        User u = userService.findByUserName(username);
        if (u == null) {

            //注册操作
            userService.register(username, password);
            return Result.success();
        } else {

            //占用
            return Result.error("用户名已占用");

        }

    }

}