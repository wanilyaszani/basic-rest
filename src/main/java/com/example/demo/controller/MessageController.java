package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


// @Controller - @ResponseBody is needed
@RestController
public class MessageController {

    @GetMapping("/message")
    Message send() {
        return new Message("first message");
    }

    @PostMapping("/message")
    Message echo (@RequestBody Message message) {

        return message;

    }
}
