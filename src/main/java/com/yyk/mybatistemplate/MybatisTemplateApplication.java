package com.yyk.mybatistemplate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yyk.mybatistemplate")
public class MybatisTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisTemplateApplication.class, args);
    }

}
