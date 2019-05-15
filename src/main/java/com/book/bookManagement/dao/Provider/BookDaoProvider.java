package com.book.bookManagement.dao.Provider;

import com.book.entity.Book;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 22:29
 */
public class BookDaoProvider {

    //新增图书
    public String addBook(Book book){
        String sql = " INSERT into b_book (book_category_id, upload_user_id, upload_user_openid, bookName, bookReview, isShared, readPeriod, uploadDate) " +
                "VALUES (#{bookCategoryId},#{uploadUserId},#{uploadUserOpenid},#{bookName},#{bookReview},#{isShared},#{readPeriod},#{uploadDate})";
        return sql;
    }

    //根据用户的openid获取图书信息
    public String findBookByOpenid(String openid){
        String sql = "  select * from b_book " +
                " where upload_user_openid ='"+openid+"'";
        return sql;
    }

    //遍历所有的图书信息
    public String findBookAll(){
        String sql = "  select * from b_book;";
        return sql;
    }
    //查找图书信息
    public String findBookById(String id){
        String sql = "  select * from b_book " +
                " where id = "+id;
        return sql;
    }

    //更新分享
    public String updateBookById(String id,String isShared){
        String sql = "UPDATE b_book " +
                "SET isShared="+ isShared +
                " where id =" + id;
        return sql;
    }

    //更新书评
    public String updateBookReviewById(String id,String bookReview){
        String sql = "UPDATE b_book " +
                "SET bookReview="+ bookReview.toString() +
                " where id =" + id;
        return sql;
    }


}
