package com.alevikzs.codewars;

/**
 * https://www.codewars.com/kata/545cedaa9943f7fe7b000048
 */
public class PangramChecker {

    public boolean check(final String sentence) {
        return sentence.toLowerCase().replaceAll("[^a-z]", "").chars().distinct().count() == 26;
    }

}
