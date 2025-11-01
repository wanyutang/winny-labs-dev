package com.example.demo.controller;

import com.example.demo.client.HelloFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignTestController {

    private final HelloFeignClient helloFeignClient;

    public FeignTestController(HelloFeignClient helloFeignClient) {
        this.helloFeignClient = helloFeignClient;
    }

    @GetMapping("/feign-hello")
    public String feignHello() {
        return helloFeignClient.getHello();
        //return "feign-hello";
    }
}