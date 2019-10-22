package com.ldf.PB_admin.controller;

import com.ldf.PB_admin.pojo.AccountExp;
import com.ldf.PB_admin.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @PackageName:com.ldf.PB_admin.controller
 * @ClassName:AccountController
 * @Description:
 * @Author:刘东峰
 * @Date:2019/10/22 002215:06
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService service;

     /* @Author 刘东峰
      * @Description 账户注册
      */
    @RequestMapping("/register")
    public String registerAccount(AccountExp accountExp){
        System.out.println("1111111111");
        return null;
    }

     /* @Author 刘东峰
      * @Description 获取手机验证码
      */
    @RequestMapping("/getPhoneValidateCode")
    public @ResponseBody String getPhoneValidateCode(){
        service.getPhoneValidateCode();
        return "";
    }
}
