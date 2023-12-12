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

        assertTrue("The number is not probable prime", prime.isProbablePrime(1000));

        assertEquals("The number length is not 1000 bits", 1000, prime.bitLength());
    }

}
