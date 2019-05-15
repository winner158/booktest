package com.book.bookManagement.controller;

import com.book.bookManagement.service.CategorylistService;
import com.book.comm.ActionResult;
import com.book.entity.Categorylist;
import com.book.enume.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: pfsun
 * @Date: 2019-04-22 11:34
 */
@RestController
@CrossOrigin(origins = "*")
public class CategorylistController {


    @Autowired
    private CategorylistService categorylistService;


    @GetMapping("/findall")
    public ActionResult findAll(){
        List<Categorylist> categorylists = categorylistService.findAll();
        return new ActionResult(
                ResultEnum.SUCCESS.getResultCode(),
                categorylists,
                null
        );
    }



}
