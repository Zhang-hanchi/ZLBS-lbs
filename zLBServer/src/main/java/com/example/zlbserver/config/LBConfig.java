package com.example.zlbserver.config;

import com.example.zlbserver.container.PolicyContainer;
import com.example.zlbserver.policy.MyPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class LBConfig {
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
