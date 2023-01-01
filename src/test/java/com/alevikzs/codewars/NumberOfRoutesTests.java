package com.alevikzs.codewars;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfRoutesTests {

    @Test
    public void test() {
        assertEquals(new BigInteger("2"), GridPath.numberOfRoutes(1, 1));
        assertEquals(new BigInteger("10"), GridPath.numberOfRoutes(2, 3));
        assertEquals(new BigInteger("6"), GridPath.numberOfRoutes(5, 1));
        assertEquals(new BigInteger("35"), GridPath.numberOfRoutes(3, 4));
    }

}