package com.motan.client;

import com.weibo.api.motan.config.springsupport.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lfwang on 2017/8/14.
 */
@Configuration
public class MotanClientConfiguration {
    
    @Bean
    public AnnotationBean motanAnnotationBean() {
        AnnotationBean motanAnnotationBean = new AnnotationBean();
        motanAnnotationBean.setPackage("com.motan.client.controller");
        return motanAnnotationBean;
    }
    
    @Bean(name = "motan")
    public ProtocolConfigBean protocolConfig() {
        ProtocolConfigBean configBean = new ProtocolConfigBean();
        configBean.setDefault(true);
        configBean.setName("motan");
        configBean.setMaxContentLength(1048576);
        return configBean;
    }
    
    @Bean(name = "registry")
    public RegistryConfigBean registryConfig() {
        RegistryConfigBean configBean = new RegistryConfigBean();
        configBean.setRegProtocol("local");
        return configBean;
    }
    
    @Bean(name = "basicRefererConfig")
    public BasicRefererConfigBean basicRefererConfig() {
        BasicRefererConfigBean config = new BasicRefererConfigBean();
        config.setProtocol("motan");
        config.setRegistry("registry");
        config.setThrowException(true);
        return config;
    }
}
