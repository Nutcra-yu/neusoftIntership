package com.neuedu.bank.service;

import com.neuedu.bank.controller.JsonResult;
import com.neuedu.bank.pojo.Account;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
public interface IAccountService extends IService<Account> {
    public List<Account> findRelateAccountByTel(String tel);

}
