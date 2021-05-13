package com.jinns.optimize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 性能优化微服务
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class OptimizeApplication {
    public static void main(String[] args) {
        SpringApplication.run(OptimizeApplication.class, args);
    }
}
