package com.alevikzs.codewars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * https://www.codewars.com/kata/555624b601231dc7a400017a
 */
public class JosephusSurvivor {

    public static int josephusSurvivor(final int n, final int k) {
        final List<Integer> sequence = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sequence.add(i);
        }

        Iterator<Integer> iterator = sequence.iterator();
        while (sequence.size() > 1) {
            for (int i = 1; i <= k; i++) {
                if (!iterator.hasNext()) {
                    iterator = sequence.iterator();
                }
                iterator.next();
                if (i == k) {
                    iterator.remove();
                }
            }
        }

        return sequence.get(0);
    }

}
