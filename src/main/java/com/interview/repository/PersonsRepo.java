package com.interview.repository;

import com.interview.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface PersonsRepo extends JpaRepository<Persons, Long> {
    List<Persons> findByCountryId(String countryId);
    List<Persons> findByScannedBy(String scannedBy);
    List<Persons> findByDecision(String qualifiedDisqualified);
}

