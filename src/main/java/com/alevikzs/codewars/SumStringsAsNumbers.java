package com.alevikzs.codewars;

/**
 * <a href="https://www.codewars.com/kata/5324945e2ece5e1f32000370">Sum Strings as Numbers</a>
 */
public class SumStringsAsNumbers {

    public static String sumStrings(String a, String b) {
        a = clearFirstZero(a);
        b = clearFirstZero(b);

        char[] numbersA = a.toCharArray();
        char[] numbersB = b.toCharArray();

        boolean greaterThenNine = false;

        int indexA = numbersA.length - 1;
        int indexB = numbersB.length - 1;

        StringBuilder result = new StringBuilder();
        while (indexA >= 0 || indexB >= 0) {
            int numberA = 0 > indexA ? 0 : Character.getNumericValue(numbersA[indexA]);
            int numberB = 0 > indexB ? 0 : Character.getNumericValue(numbersB[indexB]);

            int sum = numberA + numberB + (greaterThenNine ? 1 : 0);

            greaterThenNine = sum > 9;

            result.insert(0, sum % 10);

            indexA--;
            indexB--;
        }

        if (greaterThenNine) {
            result.insert(0, 1);
        }

        return result.toString();
    }

    private static String clearFirstZero(String number) {
        while(number.length() > 1 && number.startsWith("0")) {
            number = number.substring(1);
        }

        return number;
    }

}