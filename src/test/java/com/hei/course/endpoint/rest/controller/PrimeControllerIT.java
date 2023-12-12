package com.hei.course.endpoint.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RestController
public class PrimeControllerIT {

    @Autowired
    private PrimeController controller;

    @Test
    public void testGeneratePrime() {
        BigInteger prime = controller.generatePrime();

        assertTrue("The number is not probable prime", prime.isProbablePrime(100));

        assertEquals("The number length is not 100 bits", 100, prime.bitLength());
    }

}
