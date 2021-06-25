package com.ds.rabbitmq.service;

import com.ds.rabbitmq.service.fallback.MessageServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ds
 */
@FeignClient(name = "rabbitmq-producer",path = "rabbitmq",fallback = MessageServiceFallback.class)
public interface MessageService {
    /**
     * 发送测试消息
     * @param msg
     * @return
     */
    @PostMapping("sendTestMsg")
    boolean sendTestMsg(@RequestParam String msg);
}
