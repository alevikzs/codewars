package TriangleNumberCheck;

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