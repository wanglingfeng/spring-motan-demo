package com.motan.client.controller;

import com.motan.rpc.HelloService;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lfwang on 2017/8/14.
 */
@RestController
public class HelloController {
    
    @MotanReferer(basicReferer = "basicRefererConfig", directUrl = "127.0.0.1:8002")
    private HelloService helloService;
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(defaultValue = "world") String word) {
        return helloService.hello(word);
    }
}
