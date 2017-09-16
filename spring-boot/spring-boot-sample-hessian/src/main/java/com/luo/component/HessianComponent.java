package com.luo.component;

import com.luo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Component;

@Component
public class HessianComponent {

    @Autowired
    HelloService helloService;

    @Bean(name = "/HelloService")
    public HessianServiceExporter helloService() {
        HessianServiceExporter exporter = new HessianServiceExporter();

        exporter.setService(helloService);
        exporter.setServiceInterface(HelloService.class);

        return exporter;
    }

}
