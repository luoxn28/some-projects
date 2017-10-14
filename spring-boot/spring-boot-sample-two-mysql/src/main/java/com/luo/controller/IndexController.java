package com.luo.controller;

import com.luo.dao.cluster.PersonDao2;
import com.luo.dao.master.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    PersonDao personDao;

    @Autowired
    PersonDao2 personDao2;

    @GetMapping
    public Object index() {
        return personDao.selectList();
    }

    @GetMapping("index")
    public Object index2() {
        return personDao2.selectList();
    }

}