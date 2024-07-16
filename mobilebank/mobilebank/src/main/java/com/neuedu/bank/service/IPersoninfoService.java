package com.neuedu.bank.service;

import com.neuedu.bank.pojo.Personinfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
public interface IPersoninfoService extends IService<Personinfo> {
    public int inserByTelandPwd(String tel,String pwd);
    public Personinfo selectByTelAndPwd(String tel, String pwd);
    public Personinfo selectByTel(String tel);


   ;
}
