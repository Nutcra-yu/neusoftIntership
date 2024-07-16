package com.neuedu.bank.mapper;

import com.neuedu.bank.controller.JsonResult;
import com.neuedu.bank.pojo.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    //按手机号查询关联账户
    public List<Account> findRelateAccountByTel(String tel);

}
