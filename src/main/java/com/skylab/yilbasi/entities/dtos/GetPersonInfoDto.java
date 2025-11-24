package com.skylab.yilbasi.entities.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPersonInfoDto {

    private UUID id;

    private String question1;
    private String question2;
    private String question3;

    private String answer1;
    private String answer2;
    private String answer3;

    private GetUserDto userDto;

}
