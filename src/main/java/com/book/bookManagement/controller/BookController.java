package com.book.bookManagement.controller;

import com.book.bookManagement.service.BookService;
import com.book.bookManagement.service.CategorylistService;
import com.book.bookManagement.service.UserService;
import com.book.comm.ActionResult;
import com.book.entity.Book;
import com.book.entity.Categorylist;
import com.book.entity.User;
import com.book.enume.ResultEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 22:37
 */
@RestController
@CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private CategorylistService categorylistService;
    @Autowired
    private UserService userService;

    @GetMapping("/addbook")
    public ActionResult addUser(Book book) {
        book.setUploadDate(new Date());
        bookService.addBook(book);
        return new ActionResult(
                ResultEnum.SUCCESS.getResultCode(),
                "图书信息添加成功！",
                null
        );
    }

    @GetMapping("/findBookAll")
    public ActionResult findBookAll() {
        List<Book> bookAll = bookService.findBookAll();
        List<Object> list = new ArrayList<>();
        for (Book book : bookAll) {
            Map<String, Object> map = new HashMap<>();
            User user = userService.findByOpenid(book.getUploadUserOpenid());
            Categorylist category = categorylistService.findByCategory(book.getBookCategoryId());
            map.put("id", book.getId() + "");
            map.put("bookCategoryId", book.getBookCategoryId());
           // map.put("book_category", category.getContent());
            map.put("uploadUserId", book.getUploadUserId());
            map.put("uploadUserNickname", user.getNickname());
            map.put("uploadUserOpenid", book.getUploadUserOpenid());
            map.put("bookName", book.getBookName());
            map.put("bookReview", book.getBookReview());
            map.put("isShared", book.getIsShared());
            map.put("readPeriod", book.getReadPeriod());
            map.put("uploadDate", book.getUploadDate());
            map.put("avatarUrl", user.getAvatarUrl());
            list.add(map);
        }

        return new ActionResult(
                ResultEnum.SUCCESS.getResultCode(),
                list,
                null
        );
    }

    @GetMapping("/findBookById")
    public ActionResult findBookById(String id) {
        Map<String, Object> map = new HashMap<>();
        Book book = bookService.findBookById(id);
        User user = userService.findByOpenid(book.getUploadUserOpenid());
        map.put("id", book.getId() + "");
        map.put("bookCategoryId", book.getBookCategoryId());
        // map.put("book_category", category.getContent());
        map.put("uploadUserId", book.getUploadUserId());
        map.put("uploadUserNickname", user.getNickname());
        map.put("uploadUserOpenid", book.getUploadUserOpenid());
        map.put("bookName", book.getBookName());
        map.put("bookReview", book.getBookReview());
        map.put("isShared", book.getIsShared());
        map.put("readPeriod", book.getReadPeriod());
        map.put("uploadDate", book.getUploadDate());
        map.put("avatarUrl", user.getAvatarUrl());
        return new ActionResult(
                ResultEnum.SUCCESS.getResultCode(),
                map,
                null
        );
    }

    @GetMapping("/updateBookById")
    public ActionResult updateBookById(String id,String isShared) {
        bookService.updateBookById(id,isShared);
        return new ActionResult(
                ResultEnum.SUCCESS.getResultCode(),
                "更新成功",
                null
        );
    }

    @GetMapping("/updateBookReviewById")
    public ActionResult updateBookReviewById(String id,String bookReview) {
        bookService.updateBookReviewById(id,bookReview);
        return new ActionResult(
                ResultEnum.SUCCESS.getResultCode(),
                "更新成功",
                null
        );
    }


}
