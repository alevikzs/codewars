package com.alevikzs.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.codewars.com/kata/523f5d21c841566fde000009
 */
public class ArrayDiff {

    public static int[] arrayDiff(final int [] arr1, int [] arr2) {
        final List<Integer> result = new ArrayList<>();

        for (int el1: arr1) {
            boolean isExist = false;
            for (int el2: arr2) {
                if (el1 == el2) {
                    isExist = true;
                    break;
                }
            }

            if (!isExist) {
                result.add(el1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

}