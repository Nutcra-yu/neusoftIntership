package com.neuedu.bank.controller;
import com.alibaba.fastjson.JSON;
import lombok.Data;

import javax.swing.text.StyledEditorKit;
import java.util.Collection;

@Data
public class JsonResult<T>{
    private String code;

    private Boolean result;
    //请求返回的数据
    private T data;
    //当result为false，填入错误信息
    private String msg;


    //私有的构造函数
    public JsonResult(T data,String code){
        this.result=true;
        this.data=data;
        this.code=code;
    }
    public JsonResult(Boolean result,T data, String code){
        this.result=result;
        this.data=data;
        this.code=code;
    }
    public JsonResult(Boolean result, String msg,String code){
        this.result=result;
        this.msg=msg;
        this.code=code;
    }

    public JsonResult(Boolean result, T data, String msg,String code){
        this.result=result;
        this.data=data;
        this.msg=msg;
        this.code=code;
    }

}
