package org.example.demo3jwt.controller;

import org.example.demo3jwt.pojo.MyResponse;
import org.example.demo3jwt.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public class UserController {
    public Object login(@RequestBody User user){
        String token = 
        return new MyResponse(200,);
    }
}
