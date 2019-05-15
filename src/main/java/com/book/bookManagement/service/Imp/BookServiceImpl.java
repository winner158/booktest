package com.book.bookManagement.service.Imp;

import com.book.bookManagement.dao.BookDao;
import com.book.bookManagement.service.BookService;
import com.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 22:35
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    //新增图书
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    //根据用户的openid获取图书信息
    public List<Book> findBookByOpenid(String openid) {
        List<Book> list = bookDao.findBookByOpenid(openid);
        return list;
    }

    //遍历所有的图书信息
    public List<Book> findBookAll() {
        List<Book> list = bookDao.findBookAll();
        return list;
    }

    public Book findBookById(String id){
        Book book = bookDao.findBookById(id);
        return book;
    }

    //更新分享
    public void updateBookById(String id,String isShared){
        bookDao.updateBookById(id,isShared);
    }

    //更新书评
    public void updateBookReviewById(String id,String bookReview){
        bookDao.updateBookReviewById(id,bookReview);
    }
}
