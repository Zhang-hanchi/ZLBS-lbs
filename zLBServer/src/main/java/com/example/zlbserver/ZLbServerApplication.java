package com.example.zlbserver;

import com.example.zlbserver.config.LBSProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties({LBSProperties.class})
public class ZLbServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZLbServerApplication.class, args);
    }

}
