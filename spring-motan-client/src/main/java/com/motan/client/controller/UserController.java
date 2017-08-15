package com.motan.client.controller;

import com.motan.rpc.UserService;
import com.motan.rpc.domain.User;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lfwang on 2017/8/14.
 */
@RestController
public class UserController {

    @MotanReferer(basicReferer = "basicRefererConfig", directUrl = "127.0.0.1:8002")
    private UserService userService;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String hello(@RequestParam(defaultValue = "machine") String name,
                        @RequestParam(defaultValue = "world") String word) {
        User user = new User();
        user.setName(name);
        user.setWord(word);
        return userService.say(user);
    }
}
