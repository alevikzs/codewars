package TwiceLinear;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * http://www.codewars.com/kata/5672682212c8ecf83e000050
 */
public class DoubleLinear {

    public static int dblLinear(int n) {
        List<Integer> sequence = new ArrayList<Integer>();

        int current = 0;
        for (int i = 1; i <= n / 2; i++) {
            current = 2 * current + 1;
            sequence.add(current);
        }

        boolean useZFormula = true;

        int maxNumber = sequence.get(sequence.size() - 1);

        List<Integer> prevSequence = sequence;

        while (prevSequence.size() > 0) {
            List<Integer> nextSequence = new ArrayList<Integer>();

            Iterator<Integer> iterator = prevSequence.iterator();

            while (iterator.hasNext()) {
                int calculatedNumber;

                if (useZFormula) {
                    calculatedNumber = 3 * iterator.next() + 1;
                } else {
                    calculatedNumber = 2 * iterator.next() + 1;
                }

                System.out.println(calculatedNumber);

                if (calculatedNumber < maxNumber) {
                    nextSequence.add(calculatedNumber);
//                    sequence.add(calculatedNumber);1!!!!!!!!!!!
                } else {
                    useZFormula = false;
                    maxNumber = calculatedNumber;
                    break;
                }
            }

            prevSequence = nextSequence;
        }

        sequence.sort(null);

        return sequence.get(n);
    }

}