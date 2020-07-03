package com.interview.service;

import com.interview.entity.Persons;

import java.util.List;

public interface PersonService {
        List<Persons> findByCountryId(String countryId);
        List<Persons> findByScannedBy(String scannedBy);
        List<Persons> findByDecision(String qualifiedDisqualified);
}
