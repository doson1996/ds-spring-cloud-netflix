package com.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author ds
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.ds"})
//@ComponentScan(value = {"com.ds", "com.ds.common"})
public class AdminProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminProviderApplication.class,args);
    }
}
