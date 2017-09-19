package com.luo.controller;

import com.luo.component.HelloWorld;
import com.luo.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Index Web层
 * @author luo
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    HelloWorld helloWorld;

    @Autowired
    private PersonDao personDao;

    @GetMapping("/")
    public Object index() {
        helloWorld.hello();

        System.out.println(personDao.selectAll());

        return "hello spring";
    }

}
