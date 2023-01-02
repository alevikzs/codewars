package com.alevikzs.codewars;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * <a href="https://www.codewars.com/kata/51e056fe544cf36c410000fb">Most frequently used words in a text</a>
 */
public class TopWords {

    public static List<String> top3(String s) {
        Matcher matcher = Pattern.compile("([a-zA-Z']+)").matcher(s);
        Map<String, Integer> words = new HashMap<>();

        while (matcher.find()) {
            String word = matcher.group(1).toLowerCase();

            if (word.length() > word.chars().filter(c -> ((char) c) == '\'').count()) {
                words.put(word, words.getOrDefault(word, 0) + 1);
            }
        }

        return words.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}
