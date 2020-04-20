package com.logan.mybatis6.common.bean;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
@Builder
public class  Result<T> implements Serializable {

    private static final String successCode = "0000";

    private String code;
    private String msg;
    private T data;

    public Result(){
        this.code = successCode;
        this.msg = "请求成功";
    }

    public Result(String code, String msg, T data){
        this();
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public Result(String code, String msg){
        this();
        this.code=code;
        this.msg=msg;
    }

    public Result(T data){
        this();
        this.data=data;
    }
}
