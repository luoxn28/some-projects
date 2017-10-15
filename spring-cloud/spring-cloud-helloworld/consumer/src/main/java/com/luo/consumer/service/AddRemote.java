package com.luo.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "add-service")
public interface AddRemote {

    @RequestMapping(value = "/add/{a}/{b}")
    String hello(@PathVariable("a") int a, @PathVariable("b") int b);

}
