package com.zhc.zlbserver2.controller;

import com.zhc.zlbserver2.policy.MyPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
