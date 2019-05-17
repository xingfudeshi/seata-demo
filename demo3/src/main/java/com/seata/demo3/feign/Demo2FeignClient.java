package com.seata.demo3.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo2", url = "127.0.0.1:8082")
public interface Demo2FeignClient {
    @GetMapping("/demo2/insert")
    void insert();
}
