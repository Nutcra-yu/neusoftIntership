package com.zyu.neusoft.demo1.utils;


import com.zyu.neusoft.demo1.pojo.User;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import java.util.Date;
import java.util.UUID;


public class TokenUtils {

    public static String getToken(User user){
        JwtBuilder jwtBuilder = Jwts.builder();
        return jwtBuilder
//                header
                .header()
                .keyId(UUID.randomUUID().toString())
                .and()
//                payload
                .issuer(user.getName())
                .claim("id",user.getId())
                .expiration(new Date(System.currentTimeMillis()+1000*60))
//                signature
                .signWith(Jwts.SIG.HS256.key().build())
//                compact
                .compact();
    }

    public static boolean checkToken(String token){
        boolean flag;

        try{
            Jwts.parser()
                    .verifyWith(Jwts.SIG.HS256.key().build())
                    .build()
                    .parseSignedClaims(token);
            //jws可用
            flag = true;
        }catch (JwtException exception){
            //jws不可用
            flag = false;
        }

        return flag;
    }

}
