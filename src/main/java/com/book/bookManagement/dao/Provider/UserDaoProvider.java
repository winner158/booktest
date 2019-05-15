package com.book.bookManagement.dao.Provider;

import com.book.entity.User;

/**
 * Created by 史煜 on 2019/4/21.
 * Describe：
 */
public class UserDaoProvider {
    //添加用户：
    public String addUser(User user){
        String sql = " INSERT  into b_user(openId,nickname,avatarUrl,gender,province,city,country,registerTime) " +
                "VALUES (#{openId},#{nickname},#{avatarUrl},#{gender},#{province},#{city},#{country},#{registerTime})";
        return sql;
    }
    public String findByUserName(User user){
        String sql = "  select * from b_user " +
                " where openId =  #{openId}";
        return sql;
    }

    public String findByOpenid(String openid){
        String sql = "  select * from b_user " +
                " where openId = '"+openid+"'";
        return sql;
    }
}
