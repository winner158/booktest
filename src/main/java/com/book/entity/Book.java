package com.book.entity;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 22:25
 */
@Data
public class Book {
    private int id;

    private int bookCategoryId;

    private int uploadUserId;

    private String uploadUserOpenid;

    private String bookName;

    private String bookReview;

    private int isShared;

    private int readPeriod;

    private Date uploadDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(int bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public int getUploadUserId() {
        return uploadUserId;
    }

    public void setUploadUserId(int uploadUserId) {
        this.uploadUserId = uploadUserId;
    }

    public String getUploadUserOpenid() {
        return uploadUserOpenid;
    }

    public void setUploadUserOpenid(String uploadUserOpenid) {
        this.uploadUserOpenid = uploadUserOpenid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookReview() {
        return bookReview;
    }

    public void setBookReview(String bookReview) {
        this.bookReview = bookReview;
    }

    public int getIsShared() {
        return isShared;
    }

    public void setIsShared(int isShared) {
        this.isShared = isShared;
    }

    public int getReadPeriod() {
        return readPeriod;
    }

    public void setReadPeriod(int readPeriod) {
        this.readPeriod = readPeriod;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}
