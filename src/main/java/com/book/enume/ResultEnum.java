package com.book.enume;
public enum ResultEnum {

    SUCCESS("1000"),//请求成功

    PARAM_ERROR("1001"),// 参数错误

    ISHAVING("1002"),//记录已存在

    FAILED("9999"),//本服务请求失败

    REMOTE_SERVER_FAILED("9998");//远程服务请求失败

    private String resultCode;

    ResultEnum(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return resultCode;
    }
}
