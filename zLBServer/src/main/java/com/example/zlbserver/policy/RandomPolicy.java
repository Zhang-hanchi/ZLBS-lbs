package com.example.zlbserver.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class RandomPolicy implements MyPolicy{
    @Autowired
    ArrayList serverList;

    @Override
    public String getPolicy() {
        return "random";
    }

    @Override
    public String getNext() {
        int index = new Random().nextInt(serverList.size());
        return (String) serverList.get(index);
    }
}
