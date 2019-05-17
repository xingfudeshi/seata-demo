package com.seata.demo2.service;

import com.seata.demo2.repository.DemoDAO;
import io.seata.core.context.RootContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ctl
 * @create 2019/5/17
 */
@Service
public class DemoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoService.class);

    @Autowired
    DemoDAO dao;

    @Transactional
    public void insert() {
        LOGGER.info("xid===>" + RootContext.getXID());
        dao.insert();
        throw new RuntimeException();
    }
}
