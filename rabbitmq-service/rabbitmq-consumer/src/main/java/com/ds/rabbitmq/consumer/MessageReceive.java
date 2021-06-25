package com.ds.rabbitmq.consumer;

import com.ds.rabbitmq.source.MessageSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author ds
 */

@EnableBinding(MessageSource.class)
public class MessageReceive {

    @StreamListener(MessageSource.TEST_TOPIC)
    public void testMsg(String msg) throws Exception {
        System.out.println("msg = " + msg);
    }
}
