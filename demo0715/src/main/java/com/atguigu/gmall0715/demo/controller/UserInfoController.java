package com.atguigu.gmall0715.demo.controller;

import com.atguigu.gmall0715.demo.bean.UserInfo;
import com.atguigu.gmall0715.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll() {
        return userInfoService.findAll();
    }

    @RequestMapping("findByUserInfo")
    public List<UserInfo> findByUserInfo(UserInfo userInfo){
        return userInfoService.findByUserInfo(userInfo);
    }

    @RequestMapping("findByUser")
    public List<UserInfo> findByUser(UserInfo userInfo){
        return userInfoService.findByUser(userInfo);
    }
    @RequestMapping("login")
    public UserInfo login(UserInfo userInfo){
        return userInfoService.login(userInfo);
    }
    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfoService.addUser(userInfo);
    }
    @RequestMapping("updUser")
    public void updUser(UserInfo userInfo){
        userInfoService.updUser(userInfo);
    }
    @RequestMapping("updUserByName")
    public void updUserByName(UserInfo userInfo){
        userInfoService.updUserByName(userInfo);
    }
    @RequestMapping("delUser")
    public void delUser(UserInfo userInfo){
        userInfoService.delUser(userInfo);
    }


}
