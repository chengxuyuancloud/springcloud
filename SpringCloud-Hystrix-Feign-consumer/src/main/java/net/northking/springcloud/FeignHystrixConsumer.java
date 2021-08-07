package net.northking.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/14 17:36
 * Description:
 */
@EnableFeignClients(basePackages = "net.northking.springcloud")
@EnableEurekaClient
@SpringBootApplication
public class FeignHystrixConsumer {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixConsumer.class, args);
    }
}
