package com.seata.demo1.controller;

import com.seata.demo1.service.DemoService;
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

    @RequestMapping("/demo1/insert")
    public Object insert() {
        demoService.insert();
        return true;
    }
}
