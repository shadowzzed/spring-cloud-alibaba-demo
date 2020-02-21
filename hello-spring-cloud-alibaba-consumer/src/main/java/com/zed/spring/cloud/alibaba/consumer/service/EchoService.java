package com.zed.spring.cloud.alibaba.consumer.service;

import com.zed.spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * use feign to connect to nacos and get serivce
 * @author Zed
 * @date 2020/2/19 下午6:54
 * @contact shadowl91@163.com
 */
@FeignClient(name = "service-provider", fallback = EchoServiceFallBack.class)
public interface EchoService {

    /**
     * if provider provides pathvariable this interface must use pathvariable too
     * or it cannot get the service
     * @param str
     * @return
     */
    @GetMapping("/echo/{str}")
    public String echo(@PathVariable("str") String str);

    @GetMapping("/lb")
    public String lb();
}
