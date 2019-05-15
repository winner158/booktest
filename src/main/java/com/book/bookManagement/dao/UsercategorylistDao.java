package com.book.bookManagement.dao;

import com.book.bookManagement.dao.Provider.UsercategorylistDaoProvider;
import com.book.entity.Usercategorylist;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 20:45
 */
public interface UsercategorylistDao {
    //根据openid查找分类信息
    @SelectProvider(type = UsercategorylistDaoProvider.class,method = "findCategoryByOpenid")
    public Usercategorylist findCategoryByOpenid(String openid);

    //根据openid更改用户的分类信息
    @UpdateProvider(type = UsercategorylistDaoProvider.class,method = "updateCategoryByOpenid")
    public void updateCategoryByOpenid(Usercategorylist usercategorylist);

    //添加用户分类信息
    @UpdateProvider(type = UsercategorylistDaoProvider.class,method = "addCategory")
    public void addCategory(Usercategorylist usercategorylist);

}
