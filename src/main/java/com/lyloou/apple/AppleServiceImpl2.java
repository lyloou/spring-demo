package com.lyloou.apple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AppleServiceImpl2 implements AppleService {
    @Autowired
    Apple apple;

    @Override
    public void printAppleInfo() {
        System.out.println("id2=" + apple.getId());
        System.out.println("name2=" + apple.getName());
        System.out.println("note2=" + apple.getNote());
    }
}
