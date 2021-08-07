package net.northking.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/14 17:15
 * Description:
 */
@EnableEurekaClient
@MapperScan("net.northking.springcloud.mapper")
@SpringBootApplication
public class EurekaProvider {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider.class, args);
    }
}
