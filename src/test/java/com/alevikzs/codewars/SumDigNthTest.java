package com.alevikzs.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigNthTest {

    @Test
    public void test1() {
        assertEquals(SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 6), 10);
        assertEquals(SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 15), 10);
        assertEquals(SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 50), 9);
        assertEquals(SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 78), 10);
        assertEquals(SumDigNth.sumDigNthTerm(10, new long[]{2, 1, 3}, 157), 7);
    }

}