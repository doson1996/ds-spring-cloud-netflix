package com.ds.common.exception;

import cn.hutool.core.util.StrUtil;
import com.ds.common.result.Result;
import com.ds.common.result.ResultMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ds
 */
@Slf4j
@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 系统异常捕获
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result handlerException(Exception e){
        log.error("发生异常-->>" + e);
        e.printStackTrace();

        return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                null);
    }

    /**
     * 业务异常捕获
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public Result handlerBusinessException(BusinessException e){
        log.error("发生异常: " + e);

        String msg = ResultMsg.Business_Exception_MSG;
        if (StrUtil.isNotEmpty(e.getMessage())) {
            msg = e.getMessage();
        }

        return Result.fail(msg);
    }

    /**
     * 参数异常捕获
     * @param e
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public Result handlerIllegalArgumentException(IllegalArgumentException e){
        log.error("发生异常: " + e);

        String msg = ResultMsg.PARAMETER_ERROR_MSG;
        if (StrUtil.isNotEmpty(e.getMessage())) {
            msg = e.getMessage();
        }

        return Result.fail(msg);
    }

}
