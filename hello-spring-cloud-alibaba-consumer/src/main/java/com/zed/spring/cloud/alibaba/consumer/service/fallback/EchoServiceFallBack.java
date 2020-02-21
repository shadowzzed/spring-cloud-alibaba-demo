package com.zed.spring.cloud.alibaba.consumer.service.fallback;

import com.zed.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author Zed
 * @date 2020/2/21 下午7:42
 * @contact shadowl91@163.com
 */
@Component
public class EchoServiceFallBack implements EchoService {
    @Override
    public String echo(String str) {
        return "network block";
    }

    @Override
    public String lb() {
        return "network block";
    }
}
