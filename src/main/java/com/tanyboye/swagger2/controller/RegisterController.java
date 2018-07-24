package com.tanyboye.swagger2.controller;

import com.tanyboye.swagger2.domain.User;
import com.tanyboye.swagger2.service.RegisterService;
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
@Api(value = "注册接口", tags = {"用户注册的controller"})
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @ApiOperation(value = "注册接口", notes = "用户注册")
    @PostMapping(value = "/register")
    public String login(@RequestBody User user) {
        boolean result = registerService.register(user);
        if (result) {
            return "注册成功";
        } else {
            return "注册失败";
        }
    }
}
