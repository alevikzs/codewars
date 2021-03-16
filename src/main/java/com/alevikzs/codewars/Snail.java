package com.alevikzs.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1
 */
public class Snail {

    public static int[] snail(int[][] array) {
        final int count = array.length * array.length;

        if (array.length == 1 && array[0].length == 0) {
            return new int[0];
        }

        final int[] result = new int[count];

        int[][] coords = coords(array.length);
        for (int i = 0; i < count; i++) {
            result[i] = array[coords[i][0]][coords[i][1]];
        }

        return result;
    }

    private static int[][] coords(final int n) {
        final List<Integer> parts = parts(n);
        final int[][] coordinates = new int[n*n][2];
        int index = 0;
        int[] coordinate = {0, 0};
        int direction = 1;
        int position = 1;

        for (int i1 = 0; i1 < parts.size(); i1++) {
            if (i1 != 0) {
                position = position == 1 ? 0 : 1;
                if (i1 % 2 == 0 && position == 1) {
                    direction = direction == 1 ? -1 : 1;
                }
            }

            for (int i2 = 0; i2 < parts.get(i1); i2++) {
                if (i1 != 0 || i2 != 0) {
                    coordinate = new int[] {coordinate[0], coordinate[1]};
                    coordinate[position] = coordinate[position] + direction;
                }

                coordinates[index] = coordinate;
                index++;
            }
        }

        return coordinates;
    }

    private static List<Integer> parts(final int n) {
        final List<Integer> parts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                parts.add(n);
            } else {
                parts.add(n - i);
                parts.add(n - i);
            }
        }
        return parts;
    }

}
