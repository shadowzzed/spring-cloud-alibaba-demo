package com.zed.spring.cloud.alibaba.consumer.controller;

import com.zed.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zed
 * @date 2020/2/19 下午6:53
 * @contact shadowl91@163.com
 */
@RestController
public class TestEchoController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/feign/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return echoService.echo(str);
    }

    @GetMapping("/lb")
    public String lb() {
        return echoService.lb();
    }
}
