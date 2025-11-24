package com.skylab.yilbasi.entities.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class AddCardDto {

    private String cdnLink;

    @NotBlank(message = "message can not be empty.")
    private String message;

    @NotBlank(message = "senderEmail can not be empty.")
    private String senderEmail;

    @NotBlank(message = "receiverEmail can not be empty.")
    private String receiverEmail;
}
