package com.ds.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping("echo/{msg}")
    public String echo(@PathVariable String msg){
        return "Hello From " + port +"   " + msg;
    }

}
