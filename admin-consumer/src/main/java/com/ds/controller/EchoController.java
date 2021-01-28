package com.ds.controller;

import com.ds.controller.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;


    @GetMapping("echo/{msg}")
    public String echo(@PathVariable String msg){
        return echoService.echo(msg);
    }

}
