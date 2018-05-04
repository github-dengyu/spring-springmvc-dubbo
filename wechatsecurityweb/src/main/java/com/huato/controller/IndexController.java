package com.huato.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huato.ISecurityService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

        @Autowired
        ISecurityService securityService;

        @RequestMapping("/hello")
        @ResponseBody
        public String hello (){

                String result = securityService.saySecurity("good ");
            return "hello" + result;
        }

}
