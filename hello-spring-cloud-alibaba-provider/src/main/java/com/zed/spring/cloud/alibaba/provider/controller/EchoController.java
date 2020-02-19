package com.zed.spring.cloud.alibaba.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zed
 * @date 2020/2/19 下午4:16
 * @contact shadowl91@163.com
 */
@RestController
public class EchoController {

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return "hello Nacos Provider" + str;
    }
}
