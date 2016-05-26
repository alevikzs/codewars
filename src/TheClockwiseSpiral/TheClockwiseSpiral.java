package TheClockwiseSpiral;

/**
 * http://www.codewars.com/kata/536a155256eb459b8700077e
 */
public class TheClockwiseSpiral {

    public static void main(String[] args) {
        int[][] spiral = TheClockwiseSpiral.createSpiral(5);

//        for (int[] a : spiral) {
//            for (int b : a) {
//                System.out.println(b);
//            }
//        }
    }

    public static int[][] createSpiral(int n) {
        int[][] spiral = new int[n][n];

        int[] position = {0, 0};

        for (int number = 1; number <= n * n; number++) {
            System.out.println(position[0]);
            System.out.println(position[1]);
            System.out.println("-------");
            spiral[position[0]][position[1]] = number;

            position = TheClockwiseSpiral.updateArrayPosition(position, n, spiral);
        }

        return spiral;
    }

    private static boolean canSetNumberToArray(int i, int j, int n, int[][] spiral) {
        return 0 <= i && i < n && 0 <= j && j < n && spiral[i][j] == 0;
    }

    private static int[] updateArrayPosition(int[] position, int n, int[][] spiral) {
        if (TheClockwiseSpiral.canSetNumberToArray(position[0], position[1] + 1, n, spiral)) {
            position[1] += 1;
        } else if(TheClockwiseSpiral.canSetNumberToArray(position[0] + 1, position[1], n, spiral)) {
            position[0] += 1;
        } else if(TheClockwiseSpiral.canSetNumberToArray(position[0], position[1] - 1, n, spiral)) {
            position[1] -= 1;
        } else if(TheClockwiseSpiral.canSetNumberToArray(position[0] - 1, position[1], n, spiral)) {
            position[0] -= 1;
        }

        return position;
    }

}