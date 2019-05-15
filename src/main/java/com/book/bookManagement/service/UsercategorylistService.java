package com.book.bookManagement.service;

import com.book.entity.Usercategorylist;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 20:52
 */
public interface UsercategorylistService {
    //根据openid查找分类信息
    public Usercategorylist findCategoryByOpenid(String openid);

    //根据openid更改用户的分类信息
    public void updateCategoryByOpenid(Usercategorylist usercategorylist);

    //添加用户分类信息
    public void addCategory(Usercategorylist usercategorylist);
}
