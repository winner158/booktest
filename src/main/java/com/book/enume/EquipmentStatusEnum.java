package com.book.enume;

/**
 * @author LiuWang
 * @date 2017/11/11
 */
public enum  EquipmentStatusEnum {

    /**
     * 正常
     */
    ONLINE("1","online"),

    /**
     * 故障
     */
    FAULT("2","fault"),

    /**
     * 脱机
     */
    OFFLINE("3","offline");

    private String statusCode;
    private String statusName;


    EquipmentStatusEnum(String statusCode, String statusName) {
        this.statusCode = statusCode;
        this.statusName = statusName;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
