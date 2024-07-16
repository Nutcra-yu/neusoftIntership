package com.neuedu.bank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.neuedu.bank.mapper")
public class CcnuApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcnuApplication.class, args);
    }

}
