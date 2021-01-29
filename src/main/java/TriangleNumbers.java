/**
 * http://www.codewars.com/kata/557e8a141ca1f4caa70000a6
 */
public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        long counter = 1;

        while (number > 0) {
            number -= counter;
            counter++;
        }

        return number == 0;
    }

}