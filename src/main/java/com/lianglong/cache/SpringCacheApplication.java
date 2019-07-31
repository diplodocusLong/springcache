package com.lianglong.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan({"cn.com.aiyisheng","com.lianglong.cache"})
public class SpringCacheApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCacheApplication.class, args);
    }

}
