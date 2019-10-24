package com.ldf.PB_admin.controller;

import com.ldf.PB_admin.pojo.AccountExp;
import com.ldf.PB_admin.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

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
    public String registerAccount(@Valid AccountExp accountExp, BindingResult result){
        if (result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError:fieldErrors){
                System.out.println(fieldError.getField()+":"+fieldError.getDefaultMessage());
            }
        }
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
