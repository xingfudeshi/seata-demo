package com.seata.demo1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author ctl
 * @create 2019/5/17
 */
@Component
public class DemoDAO {
    @Autowired
    JdbcTemplate template;

    public void insert() {
        template.update("INSERT INTO order_tbl(order_num)VALUES(100)");
    }
}
