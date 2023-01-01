package com.alevikzs.codewars;

import org.junit.jupiter.api.Test;

import static com.alevikzs.codewars.JosephusSurvivor.josephusSurvivor;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JosephusSurvivorTest {

    @Test
    public void test() {
        assertEquals(4, josephusSurvivor(7, 3));
        assertEquals(10, josephusSurvivor(11, 19));
        assertEquals(28, josephusSurvivor(40, 3));
        assertEquals(13, josephusSurvivor(14, 2));
        assertEquals(100, josephusSurvivor(100, 1));
    }

}