package com.book.bookManagement.controller;

import com.book.bookManagement.service.BookService;
import com.book.bookManagement.service.UserService;
import com.book.bookManagement.service.UsercategorylistService;
import com.book.comm.ActionResult;
import com.book.entity.Book;
import com.book.entity.User;
import com.book.entity.Usercategorylist;
import com.book.enume.ResultEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UsercategorylistService usercategorylistService;
    @Autowired
    private BookService bookService;

    @GetMapping("/user")
    public ActionResult addUser(User user) {
        //数据库查询该用户名是否存在
        User username = userService.findByUserName(user);
        //用户为空
        if (username == null) {
            user.setRegisterTime(new Date());
            //用户信息输入完整时-->添加用户
            if (user.getOpenId() != "" && user.getAvatarUrl() != "" && user.getCity() != "" &&
                    user.getCity() != "" && user.getCountry() != "" && user.getGender() + "" != "" &&
                    user.getNickname() != "" && user.getProvince() != "" && user.getRegisterTime() != null) {
                userService.addUser(user);//添加用户

                Usercategorylist usercategorylist = new Usercategorylist();
                usercategorylist.setUserOpenid(user.getOpenId());
                usercategorylist.setCategorylist("1,2,3,4,5");
                usercategorylistService.addCategory(usercategorylist);
                return new ActionResult(
                        ResultEnum.SUCCESS.getResultCode(),
                        "用户添加成功！",
                        null
                );
            } else {
                return new ActionResult(
                        ResultEnum.SUCCESS.getResultCode(),
                        "请输入完整参数！",
                        null
                );
            }

        } else {
            return new ActionResult(
                    ResultEnum.ISHAVING.getResultCode(),
                    "用户添加失败！用户名已存在！",
                    null
            );
        }
    }

    @GetMapping("/findCategoryByOpenid")
    public ActionResult findCategoryByOpenid(String openid) {
        Usercategorylist Usercategorylist = usercategorylistService.findCategoryByOpenid(openid);
        return new ActionResult(
                ResultEnum.SUCCESS.getResultCode(),
                Usercategorylist,
                null
        );
    }

    @GetMapping("/UpdateOrAddCategory")
    public ActionResult updateCategoryByOpenid(Usercategorylist Usercategorylist) {

        String resultinfo = null;
        if (usercategorylistService.findCategoryByOpenid(Usercategorylist.getUserOpenid()) != null) {
            //说明该用户信息已存在
            usercategorylistService.updateCategoryByOpenid(Usercategorylist);
            resultinfo = "修改成功";

        } else {
            //说明该用户信息不存在，新增信息即可
            usercategorylistService.addCategory(Usercategorylist);
            resultinfo = "初始化成功";
        }
        return new ActionResult(
                ResultEnum.SUCCESS.getResultCode(),
                resultinfo,
                null
        );
    }

    @GetMapping("/findBookByOpenid")
    public ActionResult findBookByOpenid(String openid) {
        List<Book> booklist = bookService.findBookByOpenid(openid);
        return new ActionResult(
                ResultEnum.SUCCESS.getResultCode(),
                booklist,
                null
        );
    }


}
