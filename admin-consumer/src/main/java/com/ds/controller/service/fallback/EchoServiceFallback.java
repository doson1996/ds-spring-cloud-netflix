package com.ds.controller.service.fallback;

import com.ds.controller.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String msg) {
        return "服务降级";
    }

    @Override
    public String get(String key) {
        return "redis get 服务降级";
    }

    @Override
    public String set(String key, String value) {
        return "redis set 服务降级";
    }
}