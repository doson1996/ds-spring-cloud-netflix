package com.ds.listen;

import cn.hutool.core.date.DateUtil;
import com.ds.common.redis.RedisUtil;
import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * eureka 监听
 * @author ds
 */
@Component
@Slf4j
public class EurekaStateChangeListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        log.info(event.getAppName() + "  " + event.getServerId() + "  服务下线");
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info(instanceInfo.getAppName() + "  服务注册");
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info(instanceInfo.getAppName() + "  服务进行续约");
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        log.info("注册中心可用");
    }

}
