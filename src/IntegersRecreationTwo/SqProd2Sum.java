package IntegersRecreationTwo;

import java.util.*;

/**
 * http://www.codewars.com/kata/integers-recreation-two
 */
public class SqProd2Sum {

    public static List<long[]> prod2Sum(long a, long b, long c, long d) {
        List<long[]> result = new ArrayList<long[]>();

        result.add(new long[] {
                a * c - b * d,
                a * d + b * c
        });

        if (Math.abs(a * c - b * d) != Math.abs(a * d - b * c) && Math.abs(a * c - b * d) != Math.abs(a * c + b * d)) {
            result.add(new long[] {
                    a * d - b * c,
                    a * c + b * d
            });
        }

        return result;
    }

}