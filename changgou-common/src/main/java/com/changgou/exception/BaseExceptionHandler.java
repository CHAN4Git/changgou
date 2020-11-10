package com.changgou.exception;


import com.changgou.utils.Result;
import com.changgou.utils.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseExceptionHandler {


    /**
     * 全局异常处理
     * 捕捉@ResponseBody 这个注解下的异常
     * @param e 异常
     * @return Result 返回的结果集
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return new Result(false, StatusCode.ERROR,e.getMessage());
    }
}
