package com.neuedu.bank.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultEntity {
    private String code;
    private String msg;
    private Object data;
    public ResultEntity(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

}
