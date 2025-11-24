package com.skylab.yilbasi.entities.dtos;

import com.skylab.yilbasi.entities.User;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

public class AddPersonInfoDto {
    private String question1;
    private String question2;
    private String question3;

    private String answer1;
    private String answer2;
    private String answer3;

    @NotBlank(message = "userEmail can not be empty.")
    private String userEmail;
}
