package com.alevikzs.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/5672682212c8ecf83e000050">Double Linear</a>
 */
class DoubleLinear {

    public static int dblLinear(int n) {
        final List<Integer> list = new ArrayList<>();
        list.add(1);

        int index = 0;
        while (true) {
            final int y = 2 * list.get(index) + 1;

            if (list.size() > n && list.get(n) < y) {
                return list.get(n);
            }

            insert(list, y);

            final int z = 3 * list.get(index) + 1;
            insert(list, z);

            index++;
        }
    }

    private static void insert(final List<Integer> list, final int element) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < element) {
                list.add(i + 1, element);
                break;
            } else if (list.get(i) == element) {
                break;
            }
        }
    }

}