package com.atguigu.gmall0715.demo.service;

import com.atguigu.gmall0715.demo.bean.UserInfo;

import java.util.List;

//业务层
public interface UserInfoService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 根据用户输入的条件进行查询，如果没有输入任何条件则查询所有
     */
    List<UserInfo> findByUserInfo(UserInfo userInfo);

    /**
     * 模糊查询或者范围匹配
     * @return
     */
    List<UserInfo> findByUser(UserInfo userInfo);

    /**
     * 查询单个用户
     * @return
     */
    UserInfo login(UserInfo userInfo);

    /**
     * 用户注册
     * @param userInfo
     */
    void addUser(UserInfo userInfo);

    /**
     * 按照id进行修改
     * @param userInfo
     */
    void updUser(UserInfo userInfo);
    /**
     * 按照姓名进行修改
     * @param userInfo
     */
    void updUserByName(UserInfo userInfo);

    /**
     * 删除
     * @param userInfo
     */
    void delUser(UserInfo userInfo);

}
