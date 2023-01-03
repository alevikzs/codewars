package com.alevikzs.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/integers-recreation-two">Sq Prod To Sum</a>
 */
public class SqProd2Sum {

    public static List<long[]> prod2Sum(long a, long b, long c, long d) {
        List<long[]> result = new ArrayList<>();

        result.add(new long[]{
                a * c - b * d,
                a * d + b * c
        });

        long abs = Math.abs(a * c - b * d);
        if (abs != Math.abs(a * d - b * c) && abs != Math.abs(a * c + b * d)) {
            result.add(new long[]{
                    a * d - b * c,
                    a * c + b * d
            });
        }

        return result;
    }

}