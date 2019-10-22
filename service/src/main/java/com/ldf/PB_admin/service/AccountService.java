package com.ldf.PB_admin.service;

import com.ldf.PB_admin.pojo.Account;

/**
 * @PackageName:com.ldf.PB_admin.service
 * @ClassName:AccountService
 * @Description:
 * @Author:刘东峰
 * @Date:2019/10/22 002214:55
 */
public interface AccountService {

     /* @Author 刘东峰
      * @Description 账户注册
      */
    void registerAccount(Account account);

     /* @Author 刘东峰
      * @Description 获取手机验证码
      */
    void getPhoneValidateCode();
}
