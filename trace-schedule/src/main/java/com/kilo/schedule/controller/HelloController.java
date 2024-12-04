package com.kilo.schedule.controller;

import com.common.biz.model.ReturnT;
import com.kilo.schedule.service.impl.HelloService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/")
    public ReturnT<String> hello() {
        return helloService.hello();
    }
}
