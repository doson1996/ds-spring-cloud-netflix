package com.ds.user.config;

import com.baomidou.mybatisplus.core.toolkit.AES;

/**
 * randomKey d7356a1dbd05426f
 *  datasource:
 *     url: jdbc:mysql://${base.mysql}/example?serverTimezone=Hongkong&useUnicode=true&useSSL=false&characterEncoding=utf8
 *     username: bh6qnXY6feDedY5VElyExw==  #ds
 *     password: CeAG7J23LY30sRQbsJk72w==  #test@123
 *
 * Mybatis数据安全保护
 * @author ds
 */
public class MybatisPlusMpw {
    public static void main(String[] args) {
       // String randomKey = AES.generateRandomKey();
       // System.out.println("randomKey = " + randomKey);

        String result = AES.encrypt("ds", "d7356a1dbd05426f");
        System.out.println("result = " + result);

    }
}
