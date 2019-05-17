package com.seata.demo3.service;

import com.seata.demo3.feign.Demo1FeignClient;
import com.seata.demo3.feign.Demo2FeignClient;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ctl
 * @create 2019/5/17
 */
@Service
public class DemoService {

    @Autowired
    Demo1FeignClient feignClient1;
    @Autowired
    Demo2FeignClient feignClient2;

    @GlobalTransactional
    public void testRollback() {
        feignClient1.insert();
        feignClient2.insert();
    }
}
