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
public class GetUserDto {

    private UUID id;

    private String email;

    private String firstName;
    private String lastName;

    private GetPersonInfoDto personInfoDto;

    private GetCardDto sentCardDto;

    private GetCardDto receivedCardDto;


}
