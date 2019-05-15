package com.book.bookManagement.service;

import com.book.entity.Categorylist;

import java.util.List;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 11:25
 */
public interface CategorylistService {
    //查询分类信息
    public List<Categorylist> findAll();
    public Categorylist findByCategory(int book_category_id);

}
