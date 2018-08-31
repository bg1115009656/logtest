package com.gbai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.gbai.dao"})
@ComponentScan(basePackages = {"com.gbai.filter"})
public class LogtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogtestApplication.class, args);
    }
}
