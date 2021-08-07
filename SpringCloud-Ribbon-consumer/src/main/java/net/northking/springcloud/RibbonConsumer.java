package net.northking.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/14 17:36
 * Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class RibbonConsumer {
    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumer.class, args);
    }
}
