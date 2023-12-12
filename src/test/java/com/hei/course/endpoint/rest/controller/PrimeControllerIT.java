package com.hei.course.endpoint.rest.controller;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PrimeControllerIT {

    @Test
    public void PrimeControllerTest() {
        PrimeController controller = new PrimeController();

        BigInteger prime = controller.generatePrime();

        assertTrue("The number is not probable prime", prime.isProbablePrime(100));

        assertEquals("The number length is not 100 bits", 100, prime.bitLength());
    }

}
