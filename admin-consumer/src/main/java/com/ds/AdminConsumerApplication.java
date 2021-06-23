package com.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author ds
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard
public class AdminConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminConsumerApplication.class,args);
    }
}
