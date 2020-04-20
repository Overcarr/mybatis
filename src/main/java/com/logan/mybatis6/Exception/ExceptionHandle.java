package com.logan.mybatis6.Exception;


import com.logan.mybatis6.common.bean.Result;
import com.logan.mybatis6.eums.StudentErrorCodeAndMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class ExceptionHandle {


    @ExceptionHandler(StudentException.class)
    @ResponseBody
    public Result HandleStudentException(HttpServletRequest request,StudentException ex){
        Result result;
        log.info("StudentException:code:{},msg:{}",ex.getResult().getCode(),ex.getResult().getMsg());
        result = new Result(ex.getResult().getCode(),ex.getResult().getMsg());
        return result;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result HandleException(HttpServletRequest request,Exception ep){
        Result result;
        log.info("Exception:code:{},msg:{}", StudentErrorCodeAndMsg.Network_error.getCode(),StudentErrorCodeAndMsg.Network_error.getMsg());
        result = new Result(StudentErrorCodeAndMsg.Network_error.getCode(),StudentErrorCodeAndMsg.Network_error.getMsg());
        return result;
    }
}
