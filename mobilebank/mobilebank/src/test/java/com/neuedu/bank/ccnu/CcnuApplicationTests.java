package com.neuedu.bank.ccnu;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Paths;

@SpringBootTest
class CcnuApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void createCode(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3308/testdb", "root", "wq010319")
                .globalConfig(builder -> builder
                        .author("myw")
                        .outputDir("D:/dasan/ideaworkplace/ccnu/src/main/java")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("com.neuedu.bank")
                        .entity("pojo")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .xml("mapper.xml")
                )
                .strategyConfig(builder -> builder
                        .entityBuilder()
                        .enableLombok()
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();

    }

}
