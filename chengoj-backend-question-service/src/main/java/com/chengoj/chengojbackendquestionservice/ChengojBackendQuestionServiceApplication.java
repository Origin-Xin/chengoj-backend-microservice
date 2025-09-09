package com.chengoj.chengojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.chengoj.chengojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.chengoj")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.chengoj.chengojbackendserviceclient.service"})
public class ChengojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChengojBackendQuestionServiceApplication.class, args);
    }

}
