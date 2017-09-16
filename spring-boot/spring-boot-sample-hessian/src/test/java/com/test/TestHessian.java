package com.test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.luo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes={com.luo.Application.class})
public class TestHessian {

    @Test
    public void testHessian() {
        try {
            String url = "http://localhost:8080/HelloService";

            HessianProxyFactory factory = new HessianProxyFactory();
            HelloService helloService = (HelloService) factory.create(
                    HelloService.class, url);

            System.out.println("***** " + helloService.hello());;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
