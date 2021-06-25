package com.ds.rabbitmq.producer;

import com.ds.rabbitmq.source.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author ds
 */
@EnableBinding(MessageSource.class)
public class MessageProducer {

    @Autowired
    @Output(MessageSource.TEST_TOPIC)
    private MessageChannel channel;

    public boolean sendTestMsg(String msg) {
        return channel.send(MessageBuilder.withPayload(msg).build());
    }
}
