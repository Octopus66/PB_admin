package com.ldf.PB_admin.pojo;

import javax.validation.constraints.NotNull;

/**
 * @PackageName:com.ldf.PB_admin.pojo
 * @ClassName:AccountExp
 * @Description:
 * @Author:刘东峰
 * @Date:2019/10/22 002215:16
 */
public class AccountExp extends Account {
    @NotNull(message = "验证码不能为空")
    private String validateCode;
    @NotNull(message = "短信验证码不能为空")
    private String phoneValidateCode;

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public String getPhoneValidateCode() {
        return phoneValidateCode;
    }

    public void setPhoneValidateCode(String phoneValidateCode) {
        this.phoneValidateCode = phoneValidateCode;
    }
}
