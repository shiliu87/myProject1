package com.qf.action;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/checkUser")
    @ResponseBody
    public Map<String,Object> checkUser(String username){
        Integer count = userInfoService.checks(username);
        Map<String,Object> map=new HashMap<String,Object>();
        if (count>0){
            map.put("msg","用户名已被占用");
            map.put("state",false);
        }else {
            map.put("msg","用户名可以使用");
            map.put("state",true);
        }
        return map;
    }

    @RequestMapping("/doRegist")
    public String doRegist(String username,String password,String repPas,String phonenum,String email,Integer rotype){

        String result=userInfoService.doRegist( username,password,repPas, phonenum, email, rotype);
        if (result.equals("ok")){
            return "/user/userLogin";
        }else{
            return "/user/register";
        }
    }
}
