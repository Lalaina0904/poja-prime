//package com.hei.course.endpoint.rest.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.math.BigInteger;
//import java.security.SecureRandom;
//
//@RestController
//public class PrimeController {
//    @GetMapping("/prime")
//    public static BigInteger generatePrime(int bitLength) {
//        SecureRandom random = new SecureRandom();
//        BigInteger prime;
//
//        BigInteger probablePrime = new BigInteger(bitLength, random);
//
//        while (true) {
//            if (probablePrime.isProbablePrime(1)) {
//                prime = probablePrime;
//                break;
//            }
//            probablePrime = new BigInteger(bitLength, random);
//        }
//
//        return prime;
//    }
//}
