package net.northking.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/14 17:15
 * Description:
 */
@EnableHystrix
@EnableEurekaClient
@MapperScan("net.northking.springcloud.mapper")
@SpringBootApplication
public class HystrixProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixProvider_8001.class, args);
    }
}
