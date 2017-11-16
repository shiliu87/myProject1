package com.qf.service;

import com.qf.pojo.UserInfo;

public interface UserInfoService {
    public UserInfo findById(Integer userId);

    public void doRegist(UserInfo userInfo);

    public Integer checks(String username);

    public String doRegist(String username,String password,String repPas,String phonenum,String email,Integer rotype);
}
