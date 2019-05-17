package com.seata.demo3.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo1", url = "127.0.0.1:8081")
public interface Demo1FeignClient {

    @GetMapping("/demo1/insert")
    void insert();
}
