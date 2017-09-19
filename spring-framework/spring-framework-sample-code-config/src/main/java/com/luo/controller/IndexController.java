package com.luo.controller;

import com.luo.component.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    HelloWorld helloWorld;

    @GetMapping("/")
    public Object index() {
        helloWorld.hello();

        return "hello spring";
    }

}
