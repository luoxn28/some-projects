package com.test;

import com.luo.component.HelloWorld;
import com.luo.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    @Test
    public void testSpring() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.hello();
    }

}
