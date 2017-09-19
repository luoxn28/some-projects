package com.luo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public void hello() {
        System.out.println("hello world!");
    }

}
