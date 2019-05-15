package com.book.bookManagement.service.Imp;

import com.book.bookManagement.dao.UsercategorylistDao;
import com.book.bookManagement.service.UsercategorylistService;
import com.book.entity.Usercategorylist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 20:53
 */
@Service
public class UsercategorylistServiceImpl implements UsercategorylistService {

    @Autowired
    private UsercategorylistDao usercategorylistDao;

    public Usercategorylist findCategoryByOpenid(String openid){
        Usercategorylist list = usercategorylistDao.findCategoryByOpenid(openid);
        return list;
    }

    //根据openid更改用户的分类信息
    public void updateCategoryByOpenid(Usercategorylist usercategorylist){
        usercategorylistDao.updateCategoryByOpenid(usercategorylist);
    }

    //添加用户分类信息
    public void addCategory(Usercategorylist usercategorylist){
        usercategorylistDao.addCategory(usercategorylist);
    }
}
