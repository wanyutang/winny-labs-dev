package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hello-client", url = "http://localhost:8080")
public interface HelloFeignClient {
    @GetMapping("/")
    String getHello();
}