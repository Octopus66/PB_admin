package com.ldf.PB_admin.mapper;

import com.ldf.PB_admin.pojo.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(String idCard);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(String idCard);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}