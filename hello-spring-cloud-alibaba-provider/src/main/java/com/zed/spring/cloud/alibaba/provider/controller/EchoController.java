package com.zed.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zed
 * @date 2020/2/19 下午4:16
 * @contact shadowl91@163.com
 */
@RestController
@RefreshScope
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return "hello Nacos Provider" + str;
    }

    @GetMapping(value = "/lb")
    public String lb() {
        return "from " + port;
    }
}
