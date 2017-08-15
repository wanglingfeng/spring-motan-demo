package com.motan.rpc.impl;

import com.motan.rpc.HelloService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * Created by lfwang on 2017/8/14.
 */
@MotanService
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String word) {
        return "hello " + word;
    }
}
