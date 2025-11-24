package com.skylab.yilbasi.dataAccess;

import com.skylab.yilbasi.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CardDao extends JpaRepository<Card, UUID> {

    Optional<Card> findCardByReceiver_Email(String receiverEmail);

    Optional<Card> findCardBySender_Email(String senderEmail);


}
