package com.interview.repository;

import com.interview.entity.PersonGeneralInformation;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;


public interface PersonGeneralInfoRepo extends JpaRepository< PersonGeneralInformation, Integer> {
}
