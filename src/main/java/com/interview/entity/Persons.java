package com.interview.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String eventName;
    private Date scannedDate;
    private Time scannedTime;
    private  String firstName;
    private String lastName;
    private String middleInitial;
    private String email;
    private String email_2;
    private String companyName;
    private String jobTitle;
    private String address_1;
    private String address_2;
    private String Address_3;
    private String city;
    private String stateId;
    private String zip;
    private String countryId;
    private Long phoneNumber;
    private Long phone_2_Number;
    private Long faxNumber;
    private String question;
    private String response;
    private String note;
    private String collateral;
    private String qualifiedDisqualified;
    private String scannedBy;

    public Persons() {
    }

    public Persons(String eventName, Date scannedDate, Time scannedTime, String firstName, String lastName, String middleInitial, String email, String email_2, String companyName, String jobTitle, String address_1, String address_2, String address_3, String city, String stateId, String zip, String countryId, Long phoneNumber, Long phone_2_Number, Long faxNumber, String question, String response, String note, String collateral, String qualifiedDisqualified, String scannedBy) {
        this.eventName = eventName;
        this.scannedDate = scannedDate;
        this.scannedTime = scannedTime;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.email = email;
        this.email_2 = email_2;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.address_1 = address_1;
        this.address_2 = address_2;
        this.Address_3 = address_3;
        this.city = city;
        this.stateId = stateId;
        this.zip = zip;
        this.countryId = countryId;
        this.phoneNumber = phoneNumber;
        this.phone_2_Number = phone_2_Number;
        this.faxNumber = faxNumber;
        this.question = question;
        this.response = response;
        this.note = note;
        this.collateral = collateral;
        this.qualifiedDisqualified = qualifiedDisqualified;
        this.scannedBy = scannedBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getScannedDate() {
        return scannedDate;
    }

    public void setScannedDate(Date scannedDate) {
        this.scannedDate = scannedDate;
    }

    public Time getScannedTime() {
        return scannedTime;
    }

    public void setScannedTime(Time scannedTime) {
        this.scannedTime = scannedTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_2() {
        return email_2;
    }

    public void setEmail_2(String email_2) {
        this.email_2 = email_2;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getAddress_3() {
        return Address_3;
    }

    public void setAddress_3(String address_3) {
        Address_3 = address_3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getPhone_2_Number() {
        return phone_2_Number;
    }

    public void setPhone_2_Number(Long phone_2_Number) {
        this.phone_2_Number = phone_2_Number;
    }

    public Long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(Long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCollateral() {
        return collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }

    public String getQualifiedDisqualified() {
        return qualifiedDisqualified;
    }

    public void setQualifiedDisqualified(String qualifiedDisqualified) {
        this.qualifiedDisqualified = qualifiedDisqualified;
    }

    public String getScannedBy() {
        return scannedBy;
    }

    public void setScannedBy(String scannedBy) {
        this.scannedBy = scannedBy;
    }
}
