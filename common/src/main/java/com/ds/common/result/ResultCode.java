package com.ds.common.result;

/**
 * 返回状态码
 * @author ds
 */
public class ResultCode {

    /**
     * 成功
     */
    public static final int SUCCESS = 20000;

    /**
     * 失败
     */
    public static final int FAIL = 50000;

    /**------------------------- 成功返回状态码 20000-29999 -----------------------------------*/

    /**
     * 创建成功
     */
    public static final int CREATE_SUCCESS = 20001;

    /**
     * 删除成功
     */
    public static final int DELETE_SUCCESS = 20002;

    /**
     * 修改成功
     */
    public static final int UPDATE_SUCCESS = 20003;

    /**
     * 查询成功
     */
    public static final int QUERY_SUCCESS = 20004;

    /**------------------------- 失败返回状态码 50001-59999 -----------------------------------*/

    /**
     * 创建失败
     */
    public static final int CREATE_FAIL = 50001;

    /**
     * 删除失败
     */
    public static final int DELETE_FAIL = 50002;

    /**
     * 修改失败
     */
    public static final int UPDATE_FAIL = 50003;

    /**
     * 查询失败
     */
    public static final int QUERY_FAIL = 50004;

    /**
     * 参数错误
     */
    public static final int PARAMETER_ERROR = 51001;

}
