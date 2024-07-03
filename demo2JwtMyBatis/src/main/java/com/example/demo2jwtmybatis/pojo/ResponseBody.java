package com.example.demo2jwtmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseBody {
    private String code;
    private User user;
}
