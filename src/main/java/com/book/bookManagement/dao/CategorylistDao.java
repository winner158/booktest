package com.book.bookManagement.dao;


import com.book.bookManagement.dao.Provider.CategorylistDaoProvider;
import com.book.entity.Categorylist;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 11:19
 */
public interface CategorylistDao {
    //查询分类信息
//    @SelectProvider(type = UserDaoProvider.class,method = "findByUserName")
//    public User findByUserName(User user);
    @SelectProvider(type = CategorylistDaoProvider.class,method = "findAll")
    public List<Categorylist> findAll();

    @SelectProvider(type = CategorylistDaoProvider.class,method = "findByCategoryId")
    public Categorylist findByCategory(@Param("book_category_id") int book_category_id);
}
