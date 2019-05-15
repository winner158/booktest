package com.book.bookManagement.dao.Provider;

import com.book.entity.Categorylist;

import java.util.List;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 11:22
 */
public class CategorylistDaoProvider {
    //查询分类信息
    public String  findAll(){
        String sql = "  select * from b_categorylist ";
        return sql;
    }

    public String findByCategoryId(int book_category_id){
        String sql = "  select * from b_categorylist " +
                " where id = "+book_category_id;
        System.out.println(sql);
        return sql;
    }
}
