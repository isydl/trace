package com.kilo.schedule.service.impl;

import com.common.biz.model.ReturnT;
import com.kilo.schedule.dao.XxlJobInfoDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Resource
    private XxlJobInfoDao xxlJobInfoDao;

    public ReturnT<String> hello() {
        System.out.println(xxlJobInfoDao.findAllCount());
        return ReturnT.SUCCESS;
    }
}
