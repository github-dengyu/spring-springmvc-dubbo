package com.huato.wechat;


import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.io.IOException;
/**
* @Description：启动类
* @Author： dengyu
* @Create in： 2018/5/4,15:18
*/
@SpringBootApplication
@DubboComponentScan(basePackages = "com.huato.wechat")
@ComponentScan(basePackages = "com.huato.wechat")
public class App {
    public static void main( String[] args ) throws IOException {
       /* ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.start();*/
        SpringApplication.run(App.class);
        System.in.read();
    }
}
