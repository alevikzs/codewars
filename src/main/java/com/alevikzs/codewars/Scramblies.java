package com.alevikzs.codewars;

/**
 * https://www.codewars.com/kata/scramblies
 */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        boolean result = true;

        for (char char1: str2.toCharArray()) {
            boolean isCharExist = false;

            for (char char2: str1.toCharArray()) {
                if (char2 == char1) {
                    isCharExist = true;

                    str1 = str1.substring(0, str1.indexOf(char2)) + str1.substring(str1.indexOf(char2) + 1);

                    break;
                }
            }

            if (!isCharExist) {
                result = false;

                break;
            }
        }

        return result;
    }

}