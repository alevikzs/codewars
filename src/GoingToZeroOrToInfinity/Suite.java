package GoingToZeroOrToInfinity;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * https://www.codewars.com/kata/55a29405bc7d2efaff00007c
 */
public class Suite {

    public static double going(int n) {
        BigDecimal sum = new BigDecimal("1");

        int index = 2;

        BigDecimal factorial = new BigDecimal("1");

        while (index <= n) {
            factorial = factorial.multiply(new BigDecimal(index));

            sum = sum.add(factorial);

            index++;
        }

        return sum.divide(factorial, 6, RoundingMode.DOWN).doubleValue();
    }

}
