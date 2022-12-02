package com.zhc.zlbserver2.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class RoundRoutingPolicy implements MyPolicy{
    @Autowired
    ArrayList serverList;

    AtomicInteger i = new AtomicInteger();

    @Override
    public String getPolicy() {
        return "round-routing";
    }

    @Override
    public String getNext() {
        int index = i.getAndIncrement();
        String address = (String) serverList.get(index%(serverList.size()));
        return address;
    }
}
