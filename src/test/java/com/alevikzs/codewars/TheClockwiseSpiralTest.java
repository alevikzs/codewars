package com.alevikzs.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TheClockwiseSpiralTest {

    @Test
    public void testCreateSpiral() {
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};

        assertArrayEquals(expected, TheClockwiseSpiral.createSpiral(3));
    }

}