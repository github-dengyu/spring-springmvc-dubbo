package com.huato.wechat.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.huato.ISecurityService;
import org.springframework.stereotype.Component;
/**
* @Description：安全验证实现类
* @Author： dengyu
* @Create in： 2018/5/4,15:19
*/
@Component
@Service(version = "1.0.0")
public class SecurityService implements ISecurityService {

    @Override
    public String saySecurity( String name ) {
        return "security";
    }

}
