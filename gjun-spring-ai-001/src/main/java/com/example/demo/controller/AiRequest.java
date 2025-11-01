package com.example.demo.controller;


import lombok.Data;

@Data
public class AiRequest {
    private String model;
    private String prompt;
    private boolean stream;
}