package xyz.fusheng.mybatis3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.fusheng.mybatis3.repository")
public class Mybatis3Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis3Application.class, args);
    }

}
