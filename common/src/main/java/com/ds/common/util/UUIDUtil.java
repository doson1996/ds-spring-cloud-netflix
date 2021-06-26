package com.ds.common.util;

import java.util.UUID;

/**
 * @author ds
 */
public class UUIDUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
