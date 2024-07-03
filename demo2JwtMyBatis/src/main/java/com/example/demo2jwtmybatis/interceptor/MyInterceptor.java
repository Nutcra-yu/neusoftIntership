package com.example.demo2jwtmybatis.interceptor;

import com.example.demo2jwtmybatis.utils.TokenUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;


public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader("token");

        boolean flag = TokenUtils.checkToken(token);

        request.setAttribute("flag", flag);

        System.out.println("=>拦截成功:"+flag);

        return true;
    }
}
