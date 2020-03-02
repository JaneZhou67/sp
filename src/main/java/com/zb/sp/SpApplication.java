package com.zb.sp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.zb.sp.dao")
public class SpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpApplication.class, args);
    }

}
