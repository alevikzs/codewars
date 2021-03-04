import java.math.BigInteger;

/**
 * https://www.codewars.com/kata/56a127b14d9687bba200004d
 */
public class GridPath {

    public static BigInteger numberOfRoutes (final int m, final int n) {
        return factorial(m + n).divide(factorial(m)).divide(factorial(n));
    }

    private static BigInteger factorial(final int n) {
        return n == 0 ? BigInteger.valueOf(1) : factorial(n - 1).multiply(BigInteger.valueOf(n));
    }

}