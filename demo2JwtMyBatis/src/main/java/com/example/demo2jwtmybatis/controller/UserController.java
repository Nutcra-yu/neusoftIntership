package com.example.demo2jwtmybatis.controller;

import com.example.demo2jwtmybatis.pojo.ResponseBody;
import com.example.demo2jwtmybatis.pojo.User;
import com.example.demo2jwtmybatis.utils.TokenUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public Object login(@RequestBody User user ) {
        System.out.println("==>login");

        String code,token;

        if (Objects.equals(user.getUsername(), "joey") && Objects.equals(user.getPassword(), "123456")){
            code = "200";
            token = TokenUtils.getToken(user);
        }else {
            code = "400";
            token = "null";
        }

        user.setToken(token);
        return new ResponseBody(code,user);
    }

    @RequestMapping("/shoppingCart")
    public String shoppingCart(HttpServletRequest request){
        System.out.println("==>shoppingCart");

        boolean flag = (boolean)request.getAttribute("flag");

        String shoppingCart;
        if (flag){
            shoppingCart = "已登录，shoppingCart查询成功";
        }else
            shoppingCart = "未登录，shoppingCart查询失败";

        return shoppingCart;
    }
}
