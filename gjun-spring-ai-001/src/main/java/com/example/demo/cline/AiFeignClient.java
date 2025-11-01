package com.example.demo.cline;

import com.example.demo.controller.AiRequest;
import com.example.demo.controller.AiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ai-client", url = "http://localhost:11434")
public interface AiFeignClient {

    @PostMapping("/api/generate")
    AiResponse generate(@RequestBody AiRequest request);

}