package com.skylab.yilbasi.dataAccess;

import com.skylab.yilbasi.entities.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PersonInfoDao extends JpaRepository<PersonInfo, UUID> {

    Optional<PersonInfo> findPersonInfoByUser_Email(String userEmail);

}
