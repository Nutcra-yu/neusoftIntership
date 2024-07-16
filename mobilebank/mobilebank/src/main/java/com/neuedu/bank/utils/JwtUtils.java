package com.neuedu.bank.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.neuedu.bank.pojo.Personinfo;
import org.springframework.beans.factory.annotation.Value;

import java.util.Calendar;

public class JwtUtils {
    public static final String SECRET = "ACC";

    //获取application.proprerties中配置的常量
    @Value("${secretkey}")
    private static final String SECRETKEY = null;

    //生成登录令牌的方法
    public static  String sign(Personinfo personinfo){
        //定义一个日历对象,配置令牌的有效期
        Calendar instance = Calendar.getInstance();
        // 120秒后令牌token失效
//        instance.add(Calendar.HOUR,2);
        instance.add(Calendar.MINUTE,5);

        return JWT.create()
                //将什么内容放入到令牌中，自己决定 start
                .withClaim("realname", personinfo.getRealname())
                .withClaim("birthday", personinfo.getBirthday())
                .withClaim("id", personinfo.getId())
                .withClaim("telephone",personinfo.getTelephone())
                .withClaim("sex",personinfo.getSex())
                .withClaim("secretkey",SECRETKEY)
                //将什么内容放入到令牌中，自己决定 end
                //设置令牌的有效期
                .withExpiresAt(instance.getTime())
                //设置加密模式
                .sign(Algorithm.HMAC256(SECRET));
    }

    //校验token
    public static boolean verify(String token){
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
            DecodedJWT decodedJWT  = verifier.verify(token);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    //获取token内的携带的用户名信息
    public static String getTelByToken(String token){
        DecodedJWT decodedJWT = JWT.decode(token);
        return decodedJWT.getClaim("telephone").asString();
    }

    public static Personinfo getPersonByToken(String token){
        //反编译获取token中的用户信息
        DecodedJWT decodedJWT = JWT.decode(token);
        //将值取出封装到AccountVo
        Personinfo user = new Personinfo();
        user.setId(decodedJWT.getClaim("id").asInt());
        user.setRealname(decodedJWT.getClaim("realName").asString());
        user.setTelephone(decodedJWT.getClaim("telephone").asString());
        user.setBirthday(decodedJWT.getClaim("birthday").asString());
        user.setSex(decodedJWT.getClaim("sex").asString());
        return user;
    }

}

