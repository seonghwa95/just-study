package com.purpose.juststudy.dataValidation.dto;

import jakarta.validation.constraints.NotBlank;

public class MessageCreate {

    @NotBlank(message = "메세지 제목이 없음")
    private String messageTitle;

    @NotBlank(message = "메세지 내용 없음")
    private String messageContent;
}
