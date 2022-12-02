package com.zhc.zlbserver2.config;

import com.zhc.zlbserver2.container.PolicyContainer;
import com.zhc.zlbserver2.policy.MyPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class LBSConfig {
    @Autowired
    LBSProperties properties;
    @Autowired
    PolicyContainer container;

    @Bean
    public ArrayList<String> serverList(){
        ArrayList<String> list = new ArrayList<>();
        String[] strings = properties.servers.split(",");
        for(String s : strings){
            list.add(s);
            System.out.println(s);
        }
        return list;
    }

    @Bean(name = "truePolicy")
    public MyPolicy policy(){
        return container.getPolicy(properties.policy);
    }
}
