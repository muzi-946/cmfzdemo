package com.lxm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lxm.dao")
public class CmfzdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmfzdemoApplication.class, args);
    }

}

