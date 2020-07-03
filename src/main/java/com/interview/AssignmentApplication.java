package com.interview;

import com.interview.entity.PersonDetails;
import com.interview.entity.PersonGeneralInformation;
import com.interview.repository.PersonDetailsRepo;
import com.interview.repository.PersonGeneralInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}


    @Autowired
    private PersonGeneralInfoRepo personGeneralInfoRepo;

    @Autowired
    private PersonDetailsRepo personDetailsRepo;

    @Override
    public void run(String... args) throws Exception {
        PersonDetails personDetails = new PersonDetails();
//        personDetails.setEventName("Hackathone");
//        personDetails.setCompanyName("ABC co.");
        PersonGeneralInformation personGeneralInformation = new PersonGeneralInformation();
//        personGeneralInformation.setFirstName("Rabina");
//        personGeneralInformation.setLastName("Khatiwada");
//        personGeneralInformation.setEmail("rabinakh302@gmail.com");

        personGeneralInformation.setPersonDetails(personDetails);
        personDetails.setPersonInfo(personGeneralInformation);

        personGeneralInfoRepo.save(personGeneralInformation);


    }
}
