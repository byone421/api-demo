package com.example.apidemo.result;

public enum ResultCode {

    SUCCESS(1, "成功"),
    FAIL(0, "失败");

    private int code;
    private String msg;


    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }
}
