package com.alevikzs.codewars;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata/515e271a311df0350d00000f">Square Sum</a>
 */
public class SquareSum {

    public static int squareSum(final int[] n) {
        return Arrays.stream(n).map(number -> number * number).sum();
    }

}
