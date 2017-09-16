package com.test;

import com.luo.config.ApplicationInitializer;
import com.luo.config.SpringConfig;
import com.luo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * HelloTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@ContextConfiguration(classes = {ApplicationInitializer.class, SpringConfig.class},
    loader = AnnotationConfigContextLoader.class)
public class HelloTest {

    @Autowired
    HelloService helloService;

    @Test
    public void testHello() {
        System.out.println(helloService.hello());
    }

}
