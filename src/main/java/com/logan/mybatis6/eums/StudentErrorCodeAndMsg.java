package com.logan.mybatis6.eums;

public enum StudentErrorCodeAndMsg {

    Student_number_does_not_exit("0001","学号不存在"),

    Network_error("9999","网络问题，待会重试");


    private String code;
    private String msg;

    StudentErrorCodeAndMsg(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
