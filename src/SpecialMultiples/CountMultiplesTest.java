package SpecialMultiples;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountMultiplesTest {

    @Test
    public void testCountSpecMultiple() {
        assertEquals(CountMultiples.countSpecMultiple(3, 200), 6);
        assertEquals(CountMultiples.countSpecMultiple(3, 29), 0);
        assertEquals(CountMultiples.countSpecMultiple(0, 29), 0);
    }

}