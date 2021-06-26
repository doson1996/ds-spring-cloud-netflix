package com.ds.rabbitmq.controller;

import com.ds.common.constant.MessageConstant;
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
            return Result.ok(MessageConstant.SUCCESS, msg);
        }

        return Result.fail(MessageConstant.FAILED, msg);
    }

}
