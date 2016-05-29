package TwiceLinear;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.codewars.com/kata/5672682212c8ecf83e000050
 */
public class DoubleLinear {

    public static void main(String[] args) {
        System.out.println(DoubleLinear.dblLinear(50));
    }

    public static int dblLinear(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        sequence.add(1);

        int index = 0;
        while (sequence.size() <= n) {
            int y = 2 * sequence.get(index) + 1;
            int z = 3 * sequence.get(index) + 1;

            if (!sequence.contains(y)) {
                sequence.add(y);
            }

            if (!sequence.contains(z)) {
                sequence.add(z);
            }

            sequence.sort(null);

            index++;
        }

        System.out.println(sequence);

        return sequence.get(n);
    }

}
