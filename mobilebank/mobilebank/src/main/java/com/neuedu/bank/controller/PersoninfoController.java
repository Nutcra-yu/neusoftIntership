package com.neuedu.bank.controller;

import com.neuedu.bank.pojo.Mobile;
import com.neuedu.bank.pojo.Personinfo;
import com.neuedu.bank.service.IPersoninfoService;
import com.neuedu.bank.utils.JwtUtils;
import com.neuedu.bank.utils.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myw
 * @since 2024-07-11
 */
@RestController
@RequestMapping("/personinfo")
public class PersoninfoController {
    @Autowired
    private IPersoninfoService personinfoService;

    @RequestMapping("/register")
    public Object register(@RequestBody Mobile mobile){
        //注册称为平台用户
        Personinfo personinfo=personinfoService.selectByTel(mobile.getTelephone());
        if(personinfo!=null){
            int result=0;
            result=personinfoService.inserByTelandPwd(mobile.getTelephone(),mobile.getPassword());
            if(result!=0){
                return new ResultEntity("400","插入成功",personinfo);
            }else{
                return new ResultEntity("200","插入失败");
            }
        }


        return new ResultEntity("200","该手机号不存在，请重新输入");
    }
    @RequestMapping("/login")
    public JsonResult login(@RequestBody Mobile mobile){
        //1、取  去参数
        //看参数列表
        //2、调 调用方法
        Personinfo personinfo= personinfoService.selectByTelAndPwd(mobile.getTelephone(), mobile.getPassword());
        //3、转  输出结果
        if(personinfo!=null){
            //生成token
            String token=JwtUtils.sign(personinfo);
            //如需要存储在线用户，线程池或缓存数据库中
            //返回信息
            return  new JsonResult(true,personinfo,token,"200");
        }else{
            return  new JsonResult(false,"用户名或密码不正确","400");
        }
    }

}
