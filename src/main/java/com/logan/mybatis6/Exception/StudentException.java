package com.logan.mybatis6.Exception;

import com.logan.mybatis6.eums.StudentErrorCodeAndMsg;

public class StudentException extends RuntimeException {

    private final StudentErrorCodeAndMsg result;

    public StudentException(StudentErrorCodeAndMsg result){
        this.result=result;
    }

    public StudentErrorCodeAndMsg getResult(){
        return result;
    }

}
