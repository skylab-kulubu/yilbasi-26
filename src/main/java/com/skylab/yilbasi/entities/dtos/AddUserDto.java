package com.skylab.yilbasi.entities.dtos;

import jakarta.validation.constraints.NotBlank;

public class AddUserDto {

    private String ldapSkyNumber;

    @NotBlank(message = "email can not be empty.")
    private String email;

    @NotBlank(message = "firstName can not be empty.")
    private String firstName;

    @NotBlank(message = "lastName can not be empty.")
    private String lastName;


}
