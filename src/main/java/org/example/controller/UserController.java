package org.example.controller;

import jakarta.validation.constraints.Pattern;
import org.example.pojo.Result;
import org.example.pojo.User;
import org.example.service.UserService;
import org.example.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@Pattern(regexp = "^\\S{5,16}$") String username, @Pattern(regexp = "^\\S{5,16}$") String password) {

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

    @PostMapping("/login")
    public Result<String> login(@Pattern(regexp = "^\\S{5,16}$") String username, @Pattern(regexp = "^\\S{5,16}$") String password) {
        //根据用户名查询用户
        User loginuser = userService.findByUserName(username);

        //判断用户是否存在
        if (loginuser == null) {
            return Result.error("用户不存在");
        }

        //判断密码是否正确
        if (Md5Util.getMD5String(password).equals(loginuser.getPassword())){

            //登录成功
            return Result.success("jwt token令牌");
        }
        else {
            return Result.error("密码错误");
        }

    }

}