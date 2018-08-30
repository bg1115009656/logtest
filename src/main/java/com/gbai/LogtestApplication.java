package com.gbai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.gbai.dao"})
public class LogtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogtestApplication.class, args);
    }
}
