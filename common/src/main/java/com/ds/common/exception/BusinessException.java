package com.ds.common.exception;

/**
 * @author ds
 */
public class BusinessException extends RuntimeException {

    public Integer code;

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
