package com.ds.common.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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

    /**
     * string取值
     * @param key
     * @return
     */
    public String get(String key) {
       return  (String) redisTemplate.opsForValue().get(key);
    }

    public String hget(String key, Object hashKey) {
        return (String) redisTemplate.opsForHash().get(key, hashKey);
    }

    /**
     * string存值
     * @param key
     * @param value
     */
    public void set(String key, Object value) {
       redisTemplate.opsForValue().set(key, value);
    }

}
