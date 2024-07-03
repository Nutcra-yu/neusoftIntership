package com.example.demo2jwtmybatis.utils;

import com.example.demo2jwtmybatis.pojo.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.MacAlgorithm;

import javax.crypto.SecretKey;
import java.util.UUID;

public class TokenUtils {

    private static MacAlgorithm alg = Jwts.SIG.HS512; //or HS384 or HS256
    private static SecretKey key = alg.key().build();

    public static String getToken(User user){
        return Jwts.builder()
                .claim("name", user.getUsername())
                .signWith(key,alg)
                .compact();
    }

    public static boolean checkToken(String token){
        boolean flag;

        try {
            Jwts.parser()
                    .verifyWith(key)
                    .build()
                    .parseSignedClaims(token);
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }
}
