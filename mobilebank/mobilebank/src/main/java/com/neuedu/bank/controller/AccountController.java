package com.neuedu.bank.controller;

import com.neuedu.bank.pojo.Account;
import com.neuedu.bank.service.IAccountService;
import com.neuedu.bank.service.IPersoninfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService  accountService;

    @RequestMapping("/findRelateAccountByTel")
    public Object findRelateAccountByTel(String tel){
        System.out.println(tel);
        List<Account> relateAccountByTel =accountService.findRelateAccountByTel(tel);
        if(relateAccountByTel.size()>0){
            return  new JsonResult(true,relateAccountByTel,"查询成功","200"
            );
        }else{
            return  new JsonResult(false,"查询失败","400");
        }


    }


}
