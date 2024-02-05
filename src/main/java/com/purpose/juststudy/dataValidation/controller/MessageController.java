package com.purpose.juststudy.dataValidation.controller;

import com.purpose.juststudy.dataValidation.dto.MessageCreate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @PostMapping("/messages1")
    public String message(@RequestBody MessageCreate messageCreate) throws Exception {

        String title = messageCreate.getMessageTitle();
        String content = messageCreate.getMessageContent();

        if (title == null || title.isEmpty()) {
            // error 처리!
            throw new Exception("메세지 제목이 없어요!");
        }

        // 같은 방법으로 content 진행

        return "Message 전송 성공!";
    }
}
