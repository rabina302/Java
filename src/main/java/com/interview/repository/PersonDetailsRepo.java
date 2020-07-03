package com.interview.repository;

import com.interview.entity.PersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

public interface PersonDetailsRepo extends JpaRepository<PersonDetails, Integer> {
}
