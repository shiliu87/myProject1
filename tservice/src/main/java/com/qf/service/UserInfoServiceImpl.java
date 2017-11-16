package com.qf.service;

import com.qf.dao.UserInfoMapper;
import com.qf.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo findById(Integer userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public void doRegist(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    @Override
    public Integer checks(String username) {
        Integer count = userInfoMapper.checkUserName(username);
        return count;
    }

    @Override
    public String doRegist(String username, String password, String repPas, String phonenum, String email, Integer rotype) {
        if (password.equals(repPas)){
            UserInfo userInfo=new UserInfo();
            userInfo.setEmail(email);
            userInfo.setUsername(username);
            userInfo.setPassword(password);
            userInfo.setRotype(rotype);
            userInfo.setPhonenum(phonenum);
            userInfoMapper.insert(userInfo);
            return "ok";
        }else{
            return "error";
        }
    }
}
