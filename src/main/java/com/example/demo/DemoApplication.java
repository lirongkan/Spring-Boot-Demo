package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

/*Spring Boot 应用启动类，是可以用来启动 Spring Boot 应用.
        其包含了 @SpringBootApplication 注解和 SpringApplication 类，
        并调用 SpringApplication 类的 run() 方法，就可以启动该应用*/
@SpringBootApplication
//@ComponentScan(basePackageClasses= HelloController.class)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
