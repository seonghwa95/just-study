package com.purpose.juststudy.dataValidation.controller;

import com.purpose.juststudy.dataValidation.dto.MessageCreate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @PostMapping("/messages1")
    public String message(@RequestBody MessageCreate messageCreate) {

        return "Message 전송 성공!";
    }
}
