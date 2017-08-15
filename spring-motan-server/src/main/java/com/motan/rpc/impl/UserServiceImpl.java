package com.motan.rpc.impl;

import com.motan.rpc.UserService;
import com.motan.rpc.domain.User;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * Created by lfwang on 2017/8/14.
 */
@MotanService
public class UserServiceImpl implements UserService {
    
    @Override
    public String say(User user) {
        return user.getName() + " say, " + user.getWord();
    }
}
