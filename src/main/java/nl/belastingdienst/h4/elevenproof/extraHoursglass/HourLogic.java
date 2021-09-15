package nl.belastingdienst.h4.elevenproof.extraHoursglass;

import java.util.Scanner;

public class HourLogic {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputNumber() {
        System.out.println("Enter your uneven number:");
        return scanner.nextInt();
    }

    public static int validInput() throws EvenNumberException {
        int input = inputNumber();
        if (input % 2 != 0) {
            return input;
        } else {
            throw new EvenNumberException("Number " + input + " must be odd.");
        }
    }


    public static void buildHourglass(int input) {
        for (int row = 0; row < input; row++) {
            if (isFirstRow(row) || isLastRow(input, row)) {
                System.out.print("*".repeat(input));
            } else {
                for (int pos = 0; pos < input; pos++) {
                    if (isStarPositionLeft(row, pos) || isStarPositionRight(input, row, pos)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    private static boolean isStarPositionRight(int input, int i, int k) {
        return k == (input - (i + 1));
    }

    private static boolean isStarPositionLeft(int i, int k) {
        return k == i;
    }

    private static boolean isLastRow(int input, int i) {
        return i == input - 1;
    }

    private static boolean isFirstRow(int i) {
        return i == 0;
    }
}
