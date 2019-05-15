package com.book.bookManagement.dao;
import com.book.bookManagement.dao.Provider.UserDaoProvider;
import com.book.entity.User;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;

public interface UserDao {
//查询案件信息
    @InsertProvider(type = UserDaoProvider.class,method = "addUser")
     public  void addUser(User user);

    @SelectProvider(type = UserDaoProvider.class,method = "findByUserName")
    public User findByUserName(User user);

    @SelectProvider(type = UserDaoProvider.class,method = "findByOpenid")
    public User findByOpenid(String openid);

}
