package com.ds.rabbitmq.source;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author ds
 */
public interface MessageSource {
    String TEST_TOPIC = "test-topic";

    /**
     * 测试
     * @return
     */
    @Input(TEST_TOPIC)
    MessageChannel testMsg();
}
