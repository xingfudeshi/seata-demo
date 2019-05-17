package com.seata.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ctl
 * @create 2019/5/17
 */
@SpringBootApplication
@EnableFeignClients
public class DemoProvider {
    public static void main(String[] args) {
        SpringApplication.run(DemoProvider.class, args);
    }
}
