package com.test;

import com.luo.dao.PersonDao;
import com.luo.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {com.luo.Application.class})
public class TestMysql {

    @Autowired
    PersonDao personDao;

    @Test
    public void testMysql() {

        Person person = personDao.selectByName("luo");

        System.out.println(person);
    }

}
