package com.zhc.zlbserver2;

import com.zhc.zlbserver2.config.LBSProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({LBSProperties.class})
public class ZLbServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ZLbServer2Application.class, args);
    }

}
