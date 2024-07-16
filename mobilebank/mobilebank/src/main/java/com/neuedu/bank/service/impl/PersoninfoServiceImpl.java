package com.neuedu.bank.service.impl;

import com.neuedu.bank.pojo.Personinfo;
import com.neuedu.bank.mapper.PersoninfoMapper;
import com.neuedu.bank.service.IPersoninfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@Service
public class PersoninfoServiceImpl extends ServiceImpl<PersoninfoMapper, Personinfo> implements IPersoninfoService {
    @Autowired
    PersoninfoMapper personinfoMapper;
    @Override
    public Personinfo selectByTelAndPwd(String tel, String pwd){
        return personinfoMapper.selectByTelandPwd(tel,pwd);
    }


    @Override
    public Personinfo selectByTel(String tel){
        return personinfoMapper.selectByTel(tel);
    }
    @Override
    public int inserByTelandPwd(String tel,String pwd){
        return personinfoMapper.inserByTelandPwd(tel,pwd);
    }
}
