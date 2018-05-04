package com.huato.wechat.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.huato.ISecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
* @Description：Dubbo配置类
* @Author： dengyu
* @Create in： 2018/5/4,15:18
*/
@Configuration
public class DubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("wechat-security-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("127.0.0.1:2181");
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }

    @Autowired
    ISecurityService securityService;
    @Bean
    public ServiceConfig<ISecurityService> serviceConfig(ProtocolConfig protocolConfig){
        ServiceConfig serviceConfig = new ServiceConfig();
        serviceConfig.setInterface(ISecurityService.class);
        serviceConfig.setRef(securityService);
        serviceConfig.setProtocol(protocolConfig);

        return serviceConfig;
    }
}
