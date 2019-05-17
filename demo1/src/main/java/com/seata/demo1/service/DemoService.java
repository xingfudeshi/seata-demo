package com.seata.demo1.service;

import com.seata.demo1.repository.DemoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ctl
 * @create 2019/5/17
 */
@Service
public class DemoService {

    @Autowired
    DemoDAO dao;

    @Transactional
    public void insert() {
        dao.insert();
    }
}
