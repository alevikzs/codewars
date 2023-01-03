package com.alevikzs.codewars;

/**
 * <a href="https://www.codewars.com/kata/545cedaa9943f7fe7b000048">Pangram Checker</a>
 */
public class PangramChecker {

    public boolean check(final String sentence) {
        return sentence.toLowerCase().replaceAll("[^a-z]", "").chars().distinct().count() == 26;
    }

}
