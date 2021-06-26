package com.ds.controller.service.fallback;


import com.ds.common.constant.MessageConstant;
import com.ds.common.result.Result;
import com.ds.controller.service.MessageService;
import org.springframework.stereotype.Component;

/**
 * @author ds
 */
@Component
public class MessageServiceFallback implements MessageService {
    /**
     * 消息发送失败服务降级
     * @param msg
     * @return
     */
    @Override
    public Result<String> sendTestMsg(String msg) {
        return Result.fail(MessageConstant.FAILED, msg);
    }
}
