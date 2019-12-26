package com.atguigu.gmall0715.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall0715.demo.mapper")
public class Demo0715Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0715Application.class, args);
    }

}
