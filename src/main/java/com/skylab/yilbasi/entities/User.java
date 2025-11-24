package com.skylab.yilbasi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @Column(name = "ldap_sky_number")
    private String ldapSkyNumber;

    private String email;

    private String firstName;

    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_info_id", referencedColumnName = "id")
    private PersonInfo personInfo;

    @OneToOne(mappedBy = "sender", cascade = CascadeType.ALL)
    private Card sentCard;

    @OneToOne(mappedBy = "receiver", cascade = CascadeType.ALL)
    private Card receivedCard;


}
