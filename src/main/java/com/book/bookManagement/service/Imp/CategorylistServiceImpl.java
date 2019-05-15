package com.book.bookManagement.service.Imp;

import com.book.bookManagement.dao.CategorylistDao;
import com.book.bookManagement.service.CategorylistService;
import com.book.bookManagement.service.UserService;
import com.book.entity.Categorylist;
import org.apache.ibatis.annotations.Param;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 11:26
 */
@Service
public class CategorylistServiceImpl implements CategorylistService {

//    private final static Logger logger = LoggerFactory.getLogger(CategorylistServiceImpl.class);

    @Autowired
    private CategorylistDao categorylistDao;
    //查询分类信息
    public List<Categorylist> findAll(){

        List<Categorylist> list = categorylistDao.findAll();
        return list;
    }

    public Categorylist findByCategory(@Param("book_category_id") int book_category_id){
        Categorylist categorylist = categorylistDao.findByCategory(book_category_id);
        return categorylist;

    }
}
