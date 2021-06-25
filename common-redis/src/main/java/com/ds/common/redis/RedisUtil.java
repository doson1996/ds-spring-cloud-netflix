package com.ds.common.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * redis工具类
 * @author ds
 */
@Component
public class RedisUtil {
    /**
     * 禁止实例化此类
     */
   // private RedisUtil() {}

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * string取值
     * @param key
     * @return
     */
    public String get(String key) {
       return  (String) redisTemplate.opsForValue().get(key);
    }

    /**
     * string存值
     * @param key
     * @param value
     */
    public void set(String key, Object value) {
       redisTemplate.opsForValue().set(key, value);
    }

    /**
     * string 带过期时间存值
     * @param key
     * @param value
     * @param seconds
     */
    public void set(String key, Object value, long seconds) {
        redisTemplate.opsForValue().set(key, value, seconds, TimeUnit.SECONDS);
    }

}
