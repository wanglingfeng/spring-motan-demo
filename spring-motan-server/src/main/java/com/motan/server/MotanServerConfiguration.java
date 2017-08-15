package com.motan.server;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lfwang on 2017/8/14.
 */
@Configuration
public class MotanServerConfiguration {
    
    @Bean
    public AnnotationBean motanAnnotationBean() {
        AnnotationBean motanAnnotationBean = new AnnotationBean();
        motanAnnotationBean.setPackage("com.motan.rpc");
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
    
    @Bean
    public BasicServiceConfigBean basicServiceConfig() {
        BasicServiceConfigBean config = new BasicServiceConfigBean();
        config.setExport("motan:8002");
        config.setShareChannel(true); // 多个service共享同一个端口
        config.setRegistry("registry");
        return config;
    }
}
