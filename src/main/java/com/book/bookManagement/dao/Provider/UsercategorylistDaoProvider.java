package com.book.bookManagement.dao.Provider;

import com.book.entity.User;
import com.book.entity.Usercategorylist;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 20:46
 */
public class UsercategorylistDaoProvider {

    //根据openid查找分类信息
    public String findCategoryByOpenid(String openid){
        String sql = "  select * from b_usercategorylist " +
                " where user_openid = '"+openid+"'";
        return sql;
    }
    //根据openid更改用户的分类信息
    public String updateCategoryByOpenid(Usercategorylist usercategorylist){
        String sql = "UPDATE b_usercategorylist " +
                "SET categorylist=#{categorylist}" +
                "where user_openid = #{userOpenid};" ;
        return sql;
    }
    //添加用户分类信息
    public String addCategory(Usercategorylist usercategorylist){
        String sql = " INSERT  into b_usercategorylist (user_id,user_openid,categorylist) " +
                "VALUES (#{userId},#{userOpenid},#{categorylist})";
        return sql;
    }

}
