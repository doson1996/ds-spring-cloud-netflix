package com.ds.controller;

import com.ds.controller.service.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ds
 */
@RestController
public class EchoController {

    @Resource
    private EchoService echoService;

    @GetMapping("echo/{msg}")
    public String echo(@PathVariable String msg){
        return echoService.echo(msg);
    }

}
