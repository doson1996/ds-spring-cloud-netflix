package com.ds.common.exception;

import cn.hutool.core.util.StrUtil;
import com.ds.common.result.Result;
import com.ds.common.result.ResultEnum;
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
    public Result<Object> handlerException(Exception e){
        log.error("发生异常-->>" + e);
        e.printStackTrace();

        return Result.builder()
                .withCode(ResultEnum.INTERNAL_SERVER_ERROR.getCode())
                .withMessage(ResultEnum.INTERNAL_SERVER_ERROR.getMessage())
                .build();

       /* return new Result(ResultEnum.INTERNAL_SERVER_ERROR.getCode(),
                ResultEnum.INTERNAL_SERVER_ERROR.getMessage(),
                null);*/
    }

    /**
     * 业务异常捕获
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public Result<Void> handlerBusinessException(BusinessException e){
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
    public Result<Void> handlerIllegalArgumentException(IllegalArgumentException e){
        log.error("发生异常: " + e);

        String msg = ResultMsg.PARAMETER_ERROR_MSG;
        if (StrUtil.isNotEmpty(e.getMessage())) {
            msg = e.getMessage();
        }

        return Result.fail(msg);
    }

}
