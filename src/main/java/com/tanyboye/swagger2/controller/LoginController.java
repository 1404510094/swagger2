package com.tanyboye.swagger2.controller;

import com.tanyboye.swagger2.domain.User;
import com.tanyboye.swagger2.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:chengbg
 * @date:2018/7/24
 */
@RestController
@Api(value = "登录接口", tags = {"用户登录的controller"})
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation(value = "登录接口", notes = "用户登录")
    @PostMapping(value = "/login")
    public String login(@RequestBody User user) {
        boolean result = loginService.login(user);
        if (result) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }
}
