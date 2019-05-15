package com.book.entity;

import lombok.Data;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 11:12
 */
@Data
public class Categorylist {

    private int id;
    private String Content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Categorylist() {
    }

    public Categorylist(int id, String content) {
        this.id = id;
        Content = content;
    }
}
