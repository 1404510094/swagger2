package com.tanyboye.swagger2.service.Impl;

import com.tanyboye.swagger2.domain.User;
import com.tanyboye.swagger2.service.RegisterService;
import org.springframework.stereotype.Service;

/**
 * @author:chengbg
 * @date:2018/7/24
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Override
    public boolean register(User user) {
        if (user != null && user.getUsername() != null && user.getPassword() != null) {
            return true;
        } else {
            return false;
        }
    }
}
