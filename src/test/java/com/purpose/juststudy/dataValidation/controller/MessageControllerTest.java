package com.purpose.juststudy.dataValidation.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MessageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("/messages1 요청시 'Message 전송 성공!'을 리턴한다.")
    void test1() throws Exception {
        String jsonValue = "{\"messageTitle\": \" \", \"messageContent\": \"메세지 내용입니다.\"}";

        // expected
        mockMvc.perform(post("/messages1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonValue)
                )
                .andExpect(status().isOk())
                .andExpect(content().string("Message 전송 성공!"))
                .andDo(print());
    }
}