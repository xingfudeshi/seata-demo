package com.seata.demo3.controller;

import com.seata.demo3.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ctl
 * @create 2019/5/17
 */
@RestController
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/demo3/rollback")
    public Object testRollback() {
        try {
            demoService.testRollback();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
