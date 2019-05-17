package com.seata.demo2.repository;

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
        template.update("INSERT INTO storage_tbl(storage_num)VALUES(100)");
    }
}
