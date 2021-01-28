package com.ds.controller.service.fallback;

import com.ds.controller.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String msg) {
        return "来自熔断的返回";
    }
}