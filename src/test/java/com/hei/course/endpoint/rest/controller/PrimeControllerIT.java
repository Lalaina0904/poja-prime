//package com.hei.course.endpoint.rest.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.math.BigInteger;
//@RestController
//public class PrimeControllerIT {
//    private final PrimeService primeService;
//
//    @Autowired
//    public PrimeController(PrimeService primeService) {
//        this.primeService = primeService;
//    }
//
//    @GetMapping("/generatePrime")
//    public BigInteger generatePrime() {
//        return primeService.generateRandomPrime();
//    }
//}
