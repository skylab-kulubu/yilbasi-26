package com.skylab.yilbasi.entities.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCardDto {

    private UUID id;

    private String cdnLink;

    private String message;

    private LocalDateTime createdAt;

    private GetUserDto senderDto;

    private GetUserDto receiverDto;


}
