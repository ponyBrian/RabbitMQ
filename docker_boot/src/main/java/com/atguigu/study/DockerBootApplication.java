package com.atguigu.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.study.mapper") //import org.mybatis.spring.annotation.MapperScan;
public class DockerBootApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DockerBootApplication.class, args);
    }

}


