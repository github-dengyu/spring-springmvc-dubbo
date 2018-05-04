package com.huato.wechat.service;

import com.huato.wechat.IMonitorAlarmService;
import org.springframework.stereotype.Service;

/**
 * @Description：MonitorAlarmService
 * @Author： dengyu
 * @Create in： ${Date}${Time}
 */
@Service
public class MonitorAlarmService implements IMonitorAlarmService {
    @Override
    public String sayHello(String name) {

        return name+"20881";
    }
}
