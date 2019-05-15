package com.book.enume;

/**
 * Created by LiuWang on 2017/9/9.
 */
public enum LogType {
    LOGIN("0"),
    QUERY("1"),
    ADD("2"),
    EDIT("3"),
    DELETE("4"),
    PAGE("5");

    private String logCode;
    LogType(String logCode){
        this.logCode = logCode;
    }

    public String getLogCode() {
        return logCode;
    }

}
