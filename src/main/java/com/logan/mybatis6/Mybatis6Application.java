package com.logan.mybatis6;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.logan.mybatis6.mapper")
public class Mybatis6Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis6Application.class, args);
    }

}
