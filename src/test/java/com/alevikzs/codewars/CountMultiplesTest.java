package com.alevikzs.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountMultiplesTest {

    @Test
    public void test() {
        assertEquals(CountMultiples.countSpecMultiple(3, 200), 6);
        assertEquals(CountMultiples.countSpecMultiple(3, 29), 0);
        assertEquals(CountMultiples.countSpecMultiple(0, 29), 0);
    }

}