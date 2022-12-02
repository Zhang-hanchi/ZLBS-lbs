package com.zhc.zlbserver2.container;

import com.zhc.zlbserver2.policy.MyPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
@Component
public class PolicyContainer {
    final HashMap<String, MyPolicy> policys = new HashMap<>();

    @Autowired
    private ApplicationContext context;

    public MyPolicy getPolicy(String type){
        context.getBeansOfType(MyPolicy.class).values()
                .forEach(myPolicy->policys.put(myPolicy.getPolicy(),myPolicy));
        System.out.println("策略装配完毕，共"+policys.size()+"种");
        return policys.get(type);
    }
}
