package com.book.entity;

import lombok.Data;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 20:41
 */
@Data
public class Usercategorylist {

    private int id;
    private int userId;
    private String userOpenid;
    private String categorylist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid;
    }

    public String getCategorylist() {
        return categorylist;
    }

    public void setCategorylist(String categorylist) {
        this.categorylist = categorylist;
    }


}
