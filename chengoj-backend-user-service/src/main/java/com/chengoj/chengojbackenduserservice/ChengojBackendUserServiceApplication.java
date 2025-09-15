package com.chengoj.chengojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@MapperScan("com.chengoj.chengojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.chengoj")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.chengoj.chengojbackendserviceclient.service"})
public class ChengojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChengojBackendUserServiceApplication.class, args);
    }

}
