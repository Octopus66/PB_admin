package com.ldf.PB_admin.pojo;

/**
 * @PackageName:com.ldf.PB_admin.pojo
 * @ClassName:AccountExp
 * @Description:
 * @Author:刘东峰
 * @Date:2019/10/22 002215:16
 */
public class AccountExp extends Account {

    private String validateCode;

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
