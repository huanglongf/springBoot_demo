package com.sasha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Andy on 2018/1/9.
 */
@SpringBootApplication
public class Application {
    //项目的启动入口函数---加载tomcat环境 -tomacat 加载配置文件
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
    }
}
