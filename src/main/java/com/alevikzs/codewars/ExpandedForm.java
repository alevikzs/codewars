package com.alevikzs.codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://www.codewars.com/kata/5842df8ccbd22792a4000245">Expanded Form</a>
 */
public class ExpandedForm {

    public static String expandedForm(int num) {
        char[] chars = String.valueOf(num).toCharArray();

        return IntStream.range(0, chars.length)
                .filter(i -> chars[i] != '0')
                .mapToObj(i -> String.valueOf(
                        (int) Math.pow(10, Math.abs(i - (chars.length - 1))) * Character.getNumericValue(chars[i]))
                )
                .collect(Collectors.joining(" + "));
    }

}
