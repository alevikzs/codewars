package GoingToZeroOrToInfinity;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * https://www.codewars.com/kata/55a29405bc7d2efaff00007c
 */
public class Suite {

    public static double going(int n) {
        BigDecimal sum = new BigDecimal("1");

        int currentN = n;

        while (currentN > 1) {
            sum = sum.add(Suite.factorial(currentN));
            currentN--;
        }

        return sum.divide(factorial(n), 6, RoundingMode.DOWN).doubleValue();
    }

    private static BigDecimal factorial(Integer n) {
        return n == 0 ? new BigDecimal("1") : factorial(n - 1).multiply(new BigDecimal(n.toString()));
    }

}
