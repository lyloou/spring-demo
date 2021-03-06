package com.lyloou.apple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class AppleServiceImpl implements AppleService {
    @Autowired
    Apple apple;

    @Override
    public void printAppleInfo() {
        System.out.println("id=" + apple.getId());
        System.out.println("name=" + apple.getName());
        System.out.println("note=" + apple.getNote());
    }
}
