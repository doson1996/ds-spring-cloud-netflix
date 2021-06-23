package com.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author ds
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AdminProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminProviderApplication.class,args);
    }
}
