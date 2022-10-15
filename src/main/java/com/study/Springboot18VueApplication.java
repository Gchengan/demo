package com.study;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCreateCacheAnnotation
@EnableMethodCache(basePackages = "com.study")
public class Springboot18VueApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot18VueApplication.class, args);
    }

}
