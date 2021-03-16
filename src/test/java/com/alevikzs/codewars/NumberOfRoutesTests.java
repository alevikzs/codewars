package com.alevikzs.codewars;

import java.math.BigInteger;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfRoutesTests {
    private static void tester (int m, int n, BigInteger exp) {
        assertEquals(exp, GridPath.numberOfRoutes(m, n));
    }
    @Test
    public void ExampleTests () {
        tester(1, 1, new BigInteger("2"));
        tester(2, 3, new BigInteger("10"));
        tester(5, 1, new BigInteger("6"));
        tester(3, 4, new BigInteger("35"));
    }
}