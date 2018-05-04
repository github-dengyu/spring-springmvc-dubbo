package com.huato.alarm.controller;

import com.huato.wechat.IMonitorAlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class MonitroAlarmController {

    @Autowired
    IMonitorAlarmService monitorAlarmService;

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable("name") String name){

        return monitorAlarmService.sayHello(name);
    }
    @RequestMapping("/yes")
    @ResponseBody
    public Map<String,String> yes(){
        Map<String,String> map = new HashMap<>();
        map.put("yes","yes");
        return map;
    }



}
