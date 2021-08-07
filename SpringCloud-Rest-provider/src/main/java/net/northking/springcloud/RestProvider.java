package net.northking.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/14 17:15
 * Description:
 */
@MapperScan("net.northking.springcloud.mapper")
@SpringBootApplication
public class RestProvider {
    public static void main(String[] args) {
        SpringApplication.run(RestProvider.class, args);
    }
}
