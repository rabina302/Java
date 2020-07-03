package com.interview.entity;

import javax.persistence.*;

@Entity
@Table(name = "person_general_information")
public
class PersonGeneralInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String email;
    private String email_2;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "personInfo")
    private PersonDetails personDetails;

    public PersonGeneralInformation() {
    }

    public PersonGeneralInformation(String firstName, String lastName, String middleInitial, String email, String email_2, PersonDetails personDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.email = email;
        this.email_2 = email_2;
        this.personDetails = personDetails;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail_2() {
        return email_2;
    }

    public void setEmail_2(String email_2) {
        this.email_2 = email_2;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
