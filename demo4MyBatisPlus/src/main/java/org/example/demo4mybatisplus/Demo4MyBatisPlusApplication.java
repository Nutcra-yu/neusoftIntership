package org.example.demo4mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.demo4mybatisplus.mapper")
public class Demo4MyBatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo4MyBatisPlusApplication.class, args);
    }

}
