package com.dockerdemo.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/message")
    public String getMessage()
    {
        return "welcome to Docker, you have successfully configure docker!!";
    }

}
