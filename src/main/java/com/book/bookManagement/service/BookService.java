package com.book.bookManagement.service;

import com.book.entity.Book;

import java.util.List;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 22:34
 */
public interface BookService {
    //新增图书
    public void addBook(Book book);

    //根据用户的openid获取图书信息
    public List<Book> findBookByOpenid(String openid);

    //遍历所有的图书信息
    public List<Book> findBookAll();

    public Book findBookById(String id);

    //更新分享
    public void updateBookById(String id,String isShared);

    //更新书评
    public void updateBookReviewById(String id,String bookReview);
}
