package com.ds.rabbitmq;

import com.ds.rabbitmq.source.MessageSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author ds
 */
@SpringBootApplication
@EnableDiscoveryClient

@EnableBinding(MessageSource.class)
public class RabbitMQProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMQProducerApplication.class, args);
    }
}
