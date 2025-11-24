package com.skylab.yilbasi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;


import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(length = 2048)
    private String cdnLink;

    @Column(columnDefinition = "TEXT")
    private String message;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "sender_id", nullable = false, unique = true)
    private User sender;

    @OneToOne
    @JoinColumn(name = "receiver_id", unique = true)
    private User receiver;

}
