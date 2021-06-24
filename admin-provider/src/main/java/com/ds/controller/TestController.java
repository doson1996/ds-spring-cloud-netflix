package com.ds.controller;

import com.ds.common.base.BaseController;
import com.ds.common.redis.RedisUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ds
 */
@RestController
@RequestMapping("provider-test")
public class TestController extends BaseController {

    @Resource
    private RedisUtil redisUtil;

    @GetMapping("get")
    public String get(@RequestParam String key){
        return redisUtil.get(key);
    }

    @PostMapping("set")
    public String set(@RequestParam String key, @RequestParam String value){
        redisUtil.set(key, value);
        return "保存成功!";
    }
}
