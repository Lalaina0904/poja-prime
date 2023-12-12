package com.hei.course.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.SecureRandom;

@RestController
public class PrimeController {
    @GetMapping("/prime")
    public static BigInteger generatePrime() {
        BigInteger prime = BigInteger.probablePrime(10000, new SecureRandom());
        return prime;
    }
}
