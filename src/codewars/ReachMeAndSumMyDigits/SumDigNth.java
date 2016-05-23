package codewars.ReachMeAndSumMyDigits;

public class SumDigNth {

    public static long sumDigNthTerm(long initVal, long[] patternl, int nthTerm) {
        int nthTerm2 = 1;
        int patternIndex = 0;
        long term1 = initVal;
        long term2 = initVal;

        while (nthTerm > nthTerm2) {
            term1 = term2 + patternl[patternIndex];

            patternIndex++;
            if (patternIndex > patternl.length - 1) {
                patternIndex = 0;
            }

            nthTerm2++;

            term2 = term1;
        }

        return SumDigNth.getSumOfDigits(term1);
    }

    private static long getSumOfDigits(long number) {
        long sum = 0;

        while (number > 0) {
            sum += number % 10;

            number = number / 10;
        }

        return sum;
    }

}