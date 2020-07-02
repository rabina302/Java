package com.interview.service.impl;

import com.interview.entity.Persons;
import com.interview.repository.PersonsRepo;
import com.interview.service.PersonService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonServiceImplementation implements PersonService {
    private PersonsRepo personsRepo;

    public PersonServiceImplementation(PersonsRepo personsRepo) {
        this.personsRepo = personsRepo;
    }
//    @Override
//    public List<Persons> getAll() {
//        return personsRepo.findAll(new Sort(Sort.Direction.ASC,"firstName"));
//    }

    @Override
    public List<Persons> findByCountryId(String countryId) {

        return personsRepo.findByCountryId(countryId);
    }

    @Override
    public List<Persons> findByScannedBy(String scannedBy) {
        return personsRepo.findByScannedBy(scannedBy);
    }

    @Override
    public List<Persons> findByDecision(String qualifiedDisqualified) {
        return personsRepo.findByDecision(qualifiedDisqualified);
    }
}
