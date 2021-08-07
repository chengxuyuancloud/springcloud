package net.northking.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/25 23:09
 * Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerConfig_6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfig_6001.class, args);
    }
}
