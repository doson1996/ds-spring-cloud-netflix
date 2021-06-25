package com.ds.rabbitmq.controller;

import com.ds.common.result.Result;
import com.ds.rabbitmq.producer.MessageProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ds
 */

@RestController
@RequestMapping("rabbitmq")
public class MessageController {

    @Resource
    private MessageProducer messageProducer;

    @PostMapping("sendTestMsg")
    public Result<String> sendTestMsg(@RequestParam String msg) {
        boolean result = messageProducer.sendTestMsg(msg);
        if (result) {
            return Result.ok("消息发送成功", msg);
        }

        return Result.fail("消息发送失败", msg);
    }

}
