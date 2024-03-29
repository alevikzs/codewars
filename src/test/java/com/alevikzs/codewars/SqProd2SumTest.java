package com.alevikzs.codewars;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SqProd2SumTest {

    @Test
    public void test() {
        List<long[]> exp = new ArrayList<>();
        long[] cc = new long[]{-5, 5};
        exp.add(cc);
        long[] dd = new long[]{1, 7};
        exp.add(dd);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(1, 2, 1, 3).get(0));
        assertArrayEquals(exp.get(1), SqProd2Sum.prod2Sum(1, 2, 1, 3).get(1));

        exp = new ArrayList<>();
        cc = new long[]{-7, 22};
        exp.add(cc);
        dd = new long[]{-2, 23};
        exp.add(dd);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(2, 3, 4, 5).get(0));
        assertArrayEquals(exp.get(1), SqProd2Sum.prod2Sum(2, 3, 4, 5).get(1));
    }

}