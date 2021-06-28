package com.ds.common.result;

/**
 * @author ds
 */
public enum ResultEnum {

    /**
     * 成功返回
     */
    SUCCESS(2000, "success"),

    /**
     * 失败返回
     */
    FAIL(5000, "fail");

    /**
     * code
     */
    private int code;

    /**
     * 消息
     */
    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
