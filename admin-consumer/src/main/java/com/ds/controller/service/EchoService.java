package com.ds.controller.service;

import com.ds.controller.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "admin-provider",fallback = EchoServiceFallback.class)
public interface EchoService {
    @GetMapping("echo/{msg}")
    String echo(@PathVariable String msg);
}

