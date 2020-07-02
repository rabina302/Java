package com.interview.controller;

import com.interview.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/person")
public class PersonController {
    @Autowired
    private PersonService service;
//    public Persons findByCountryId(@PathVariable String countryId) {
//        return (Persons) service.findByCountryId(countryId);
//    }
    @GetMapping("/{countryId}")
    public ResponseEntity<?> findByCountryId(@PathVariable String countryId){
        return new ResponseEntity<>(service.findByCountryId(countryId), HttpStatus.OK);
    }
    @GetMapping("/{scannedBy}")
    public ResponseEntity<?> findByScannedBy(@PathVariable String scannedBy){
        return new ResponseEntity<>(service.findByScannedBy(scannedBy), HttpStatus.OK);
    }
    @GetMapping("/{scannedBy}")
    public ResponseEntity<?> findByDecision(@PathVariable String decision){
        return new ResponseEntity<>(service.findByDecision(decision), HttpStatus.OK);
    }

}
