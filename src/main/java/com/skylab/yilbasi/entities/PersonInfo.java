package com.skylab.yilbasi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personal_infos")
public class PersonInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    private String question1;
    private String question2;
    private String question3;

    private String answer1;
    private String answer2;
    private String answer3;

    @OneToOne(mappedBy = "personInfo")
    private User user;




}
