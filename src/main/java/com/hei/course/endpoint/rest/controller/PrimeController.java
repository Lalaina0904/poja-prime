package com.hei.course.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.SecureRandom;

@RestController
public class PrimeController {
    @GetMapping("/prime")
    public BigInteger generatePrime() {
        SecureRandom random = new SecureRandom();
        return BigInteger.probablePrime(1000, random);
    }
}
