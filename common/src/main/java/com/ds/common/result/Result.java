package com.ds.common.result;

/**
 * rest返回
 * @author ds
 */
public class Result<T> {

    private int code;

    private String message;

    private T data;

    public Result() {
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * @return 成功返回
     */
    public static <T> Result<T> ok(){
        return new Result<>(ResultCode.SUCCESS, ResultMsg.SUCCESS_MSG, null);
    }

    /**
     * @param data 数据
     * @return 带指定数据的成功返回
     */
    public static <T> Result<T> ok(T data){
        return new Result<T>(ResultCode.SUCCESS, ResultMsg.SUCCESS_MSG, data);
    }

    /**
     * @param message 消息
     * @param data    数据
     * @return 带指定消息和数据的成功返回
     */
    public static <T> Result<T> ok(String message,T data){
        return new Result<T>(ResultCode.SUCCESS, message, data);
    }

    /**
     * @return 失败返回
     */
    public static <T> Result<T> fail(){
        return new Result<>(ResultCode.FAIL, ResultMsg.FAIL_MSG, null);
    }

    /**
     * @param data 数据
     * @return 带指定数据的失败返回
     */
    public static <T> Result<T> fail(T data){
        return new Result<>(ResultCode.FAIL, ResultMsg.FAIL_MSG, data);
    }

    /**
     * @param message 消息
     * @param data    数据
     * @return 带指定消息和数据的失败返回
     */
    public static <T> Result<T> fail(String message,T data){
        return new Result<>(ResultCode.FAIL, message, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
