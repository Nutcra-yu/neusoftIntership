package com.neuedu.bank.service.impl;

import com.neuedu.bank.mapper.PersoninfoMapper;
import com.neuedu.bank.pojo.Mobile;
import com.neuedu.bank.mapper.MobileMapper;
import com.neuedu.bank.pojo.Personinfo;
import com.neuedu.bank.service.IMobileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@Service
public class MobileServiceImpl extends ServiceImpl<MobileMapper, Mobile> implements IMobileService {

    @Override
    public boolean updateById(Mobile mobile) {
        return false;
    }
}
