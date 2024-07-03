package com.zyu.neusoft.demo1.Controller;

import com.zyu.neusoft.demo1.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final String DEFAULT_NAME = "Joey";
    private final String DEFAULT_PASSWORD = "123456";

    @RequestMapping("/login")
    public String login(@RequestBody User user, HttpServletRequest request){
        if (user.getName().equals(DEFAULT_NAME) && user.getPassWord().equals(DEFAULT_PASSWORD)){
            HttpSession session = request.getSession();
            session.setAttribute("currentUser",user);
        }
        return "login";
    }

    @RequestMapping("/shoppingCart")
    public Object shoppingCart(){
        return "shopping cart";
    }

}
