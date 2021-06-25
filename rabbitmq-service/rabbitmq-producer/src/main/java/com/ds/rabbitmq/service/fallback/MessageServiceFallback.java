package com.ds.rabbitmq.service.fallback;

import com.ds.rabbitmq.service.MessageService;

/**
 * @author ds
 */
public class MessageServiceFallback implements MessageService {
    @Override
    public boolean sendTestMsg(String msg) {
        return false;
    }
}
