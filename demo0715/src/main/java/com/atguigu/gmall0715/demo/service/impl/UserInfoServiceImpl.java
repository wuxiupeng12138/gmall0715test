package com.atguigu.gmall0715.demo.service.impl;

import com.atguigu.gmall0715.demo.bean.UserInfo;
import com.atguigu.gmall0715.demo.mapper.UserInfoMapper;
import com.atguigu.gmall0715.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    //调用mapper层
    @Autowired
     private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findByUserInfo(UserInfo userInfo) {
        return userInfoMapper.select(userInfo);
    }

    @Override
    public List<UserInfo> findByUser(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("loginName","%"+userInfo.getLoginName()+"%");
        return userInfoMapper.selectByExample(example);
    }

    @Override
    public UserInfo login(UserInfo userInfo) {
        //return userInfoMapper.selectByPrimaryKey(userInfo);
        return userInfoMapper.selectOne(userInfo);
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }
    @Override
    public void updUserByName(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",userInfo.getName());
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void delUser(UserInfo userInfo) {
        //根据id进行删除
        userInfoMapper.deleteByPrimaryKey(userInfo);
        // 根据范围删除
        //userInfoMapper.deleteByExample(new Example(UserInfo.class).createCriteria().andLike("name",userInfo.getName()));
        // 根据匹配字段进行删除
        userInfoMapper.delete(userInfo);
    }
}
