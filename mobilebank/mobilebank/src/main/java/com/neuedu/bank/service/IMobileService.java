package com.neuedu.bank.service;

import com.neuedu.bank.pojo.Mobile;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.bank.pojo.Personinfo;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
public interface IMobileService extends IService<Mobile> {



    public boolean updateById(Mobile mobile);

}
