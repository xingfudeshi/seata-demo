package com.seata.demo2.controller;

import com.seata.demo2.service.DemoService;
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

    @RequestMapping("/demo2/insert")
    public Object insert() {
        demoService.insert();
        return true;
    }
}
