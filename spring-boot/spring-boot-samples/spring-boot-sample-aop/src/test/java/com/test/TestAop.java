package com.test;

import com.luo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {com.luo.Application.class})
public class TestAop {

    @Autowired
    HelloService helloService;

    @Test
    public void testHelloService() {
        System.out.println(helloService.hello());
    }

}
