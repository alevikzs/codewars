package com.alevikzs.codewars;

import java.util.ArrayList;

/**
 * <a href="https://www.codewars.com/kata/55e785dfcb59864f200000d9">Count Multiples</a>
 */
public class CountMultiples {

    public static long countSpecMultiple(long n, long maxValue) {
        if (CountMultiples.findPrimes(n).isEmpty()) {
            return 0;
        }

        long minValue = 1;

        for (long prime : CountMultiples.findPrimes(n)) {
            minValue *= prime;
        }

        long count = 0;

        for (int index = 1; minValue * index < maxValue; index++) {
            count++;
        }

        return count;
    }

    private static ArrayList<Long> findPrimes(long count) {
        ArrayList<Long> primes = new ArrayList<>();

        long number = 2;
        long index = 1;

        while (index <= count) {
            boolean isPrime = true;

            for (long prime : primes) {
                if (prime != 0 && number % prime == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(number);
                index++;
            }

            number++;
        }

        return primes;
    }

}
