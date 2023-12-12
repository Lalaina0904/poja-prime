package com.hei.course.endpoint.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.SecureRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RestController
public class PrimeControllerIT {
// test code
@Test
public void testGeneratePrime() {
    PrimeController controller = new PrimeController();
    BigInteger prime = controller.generatePrime();

    assertTrue("The number is not probable prime", prime.isProbablePrime(99));

    assertEquals("The number length is not 10000 bits", 10_000, prime.bitLength());
}

}
