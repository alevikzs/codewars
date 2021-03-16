package com.alevikzs.codewars;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleNumbersTest {

    @Test
    public void test() {
        assertEquals(TriangleNumbers.isTriangleNumber(125250), true);
        assertEquals(TriangleNumbers.isTriangleNumber(3126250), true);
        assertEquals(TriangleNumbers.isTriangleNumber(10), true);
        assertEquals(TriangleNumbers.isTriangleNumber(8), false);
    }

}