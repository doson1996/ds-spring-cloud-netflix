package com.ds.controller;

import cn.hutool.core.date.DateUtil;
import com.ds.common.exception.BusinessException;
import com.ds.common.result.Result;
import com.ds.controller.service.EchoService;
import com.ds.controller.service.MessageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 测试
 * @author ds
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private EchoService echoService;

    @Resource
    private MessageService messageService;

    @GetMapping("get")
    public Result<String> get(@RequestParam String key){
        String res = echoService.get(key);
        messageService.sendTestMsg("test get-> " + key + " -->" + DateUtil.now());
        return Result.ok(res);
    }

    @PostMapping("set")
    public Result<String> set(@RequestParam String key, @RequestParam String value){
        String res = echoService.set(key, value);
        messageService.sendTestMsg("test set-> " + key + " : " + value + " -->" + DateUtil.now());
        return Result.ok(res);
    }

    @GetMapping("msg/{msg}")
    public Result<String> msg(@PathVariable String msg) {
        if ("1".equals(msg)) {
            throw new BusinessException(msg + "业务异常");
        }

        if ("2".equals(msg)) {
            throw new IllegalArgumentException(msg + "参数异常");
        }

        if ("3".equals(msg)) {
            int i = 1 / 0;
        }

        return Result.ok(echoService.echo(msg));
    }

}
