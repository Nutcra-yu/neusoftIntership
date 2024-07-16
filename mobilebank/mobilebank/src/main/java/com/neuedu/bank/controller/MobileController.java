package com.neuedu.bank.controller;

import com.neuedu.bank.pojo.Mobile;
import com.neuedu.bank.pojo.Personinfo;
import com.neuedu.bank.pojo.User;
import com.neuedu.bank.service.IMobileService;
import com.neuedu.bank.service.IPersoninfoService;
import com.neuedu.bank.utils.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@RestController
@RequestMapping("/mobile")
public class MobileController {
    @Autowired
    private IMobileService iMobileService;
    @Autowired
    private IPersoninfoService iPersoninfoService;
// 登录方法

    @RequestMapping("/update")
    public Object updateById(@RequestBody Mobile mobile){
        return null;
    }


}
