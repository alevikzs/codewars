package com.alevikzs.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleLinearTest {

    @Test
    public void test() {
        assertEquals(DoubleLinear.dblLinear(10), 22);
        assertEquals(DoubleLinear.dblLinear(20), 57);
        assertEquals(DoubleLinear.dblLinear(30), 91);
        assertEquals(DoubleLinear.dblLinear(50), 175);
    }

}
