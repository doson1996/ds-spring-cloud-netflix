package com.ds.controller.service;

import com.ds.controller.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ds
 */
@FeignClient(name = "admin-provider", fallback = EchoServiceFallback.class)
public interface EchoService {

    /**
     * echo
     * @param msg
     * @return
     */
    @GetMapping("echo/{msg}")
    String echo(@PathVariable String msg);

    /**
     * redis get测试
     * @param key
     * @return
     */
    @GetMapping("provider-test/get")
    String get(@RequestParam String key);

    /**
     * redis set测试
     * @param key
     * @param value
     * @return
     */
    @PostMapping("provider-test/set")
    String set(@RequestParam String key,@RequestParam String value);
}

