package com.example.demo.controller;

import com.example.demo.cline.AiFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiFeignController {

    private final AiFeignClient aiFeignClient;

    public AiFeignController(AiFeignClient aiFeignClient) {
        this.aiFeignClient = aiFeignClient;
    }

    @GetMapping("/feign-ai")
    public String callAiApi() {
        AiRequest request = new AiRequest();
        request.setModel("gemma3:270m");
        request.setPrompt("1句話介紹你自己");
        request.setStream(false);

        AiResponse response = aiFeignClient.generate(request);

        return response.getOutput(); // 直接回傳文字
    }
}