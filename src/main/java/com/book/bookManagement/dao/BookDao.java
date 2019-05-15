package com.book.bookManagement.dao;

import com.book.bookManagement.dao.Provider.BookDaoProvider;
import com.book.entity.Book;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 22:33
 */
public interface BookDao {

    //新增图书
    @InsertProvider(type = BookDaoProvider.class,method = "addBook")
    public void addBook(Book book);

    //根据用户的openid获取图书信息
    @SelectProvider(type = BookDaoProvider.class, method = "findBookByOpenid")
    public List<Book> findBookByOpenid(String openid);

    //遍历所有的图书信息
    @SelectProvider(type = BookDaoProvider.class, method = "findBookAll")
    public List<Book> findBookAll();

    @SelectProvider(type = BookDaoProvider.class, method = "findBookById")
    public Book findBookById(String id);

    //更新分享
    @UpdateProvider(type = BookDaoProvider.class, method = "updateBookById")
    public void updateBookById(String id,String isShared);

    //更新书评
    @UpdateProvider(type = BookDaoProvider.class, method = "updateBookReviewById")
    public void updateBookReviewById(String id,String bookReview);
}
