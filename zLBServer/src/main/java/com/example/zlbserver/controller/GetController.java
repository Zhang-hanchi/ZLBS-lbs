package com.example.zlbserver.controller;

import com.example.zlbserver.policy.MyPolicy;
import com.example.zlbserver.policy.RoundRoutingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class GetController {

    @Autowired
    ApplicationContext context;

    @Resource(name = "truePolicy")
    MyPolicy truePolicy;
    @RequestMapping("/getAddress")
    public String lbs(){
        return truePolicy.getNext();
    }

}
