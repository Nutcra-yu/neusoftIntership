package com.neuedu.bank.service.impl;

import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.neuedu.bank.controller.JsonResult;
import com.neuedu.bank.mapper.MobileMapper;
import com.neuedu.bank.mapper.PersoninfoMapper;
import com.neuedu.bank.pojo.Account;
import com.neuedu.bank.mapper.AccountMapper;
import com.neuedu.bank.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public List<Account> findRelateAccountByTel(String tel){
       List<Account> relateAccountByTel = accountMapper.findRelateAccountByTel(tel);
       return relateAccountByTel;
    }

}
