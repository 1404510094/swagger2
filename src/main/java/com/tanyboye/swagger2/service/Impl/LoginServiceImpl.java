package com.tanyboye.swagger2.service.Impl;

import com.tanyboye.swagger2.domain.User;
import com.tanyboye.swagger2.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * @author:chengbg
 * @date:2018/7/24
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean login(User user) {
        if (user.getUsername().equals("tanyboye") && user.getPassword().equals("123456")) {
            return true;
        } else {
            return false;
        }
    }
}
