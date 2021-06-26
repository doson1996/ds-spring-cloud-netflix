package com.ds.rabbitmq.consumer;

import com.ds.common.redis.RedisUtil;
import com.ds.rabbitmq.source.MessageSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import javax.annotation.Resource;

/**
 * @author ds
 */

@EnableBinding(MessageSource.class)
public class MessageReceive {

    @Resource
    private RedisUtil redisUtil;

    @StreamListener(MessageSource.TEST_TOPIC)
    public void testMsg(String msg) throws Exception {
        System.out.println("msg = " + msg);
        redisUtil.leftPush("log", msg);
    }
}
