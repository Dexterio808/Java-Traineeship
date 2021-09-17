package nl.belastingdienst.h6.array;

import java.util.Arrays;
import java.util.Scanner;

public class H6Assignment {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        //row2();
        //row4();
        //copyArray();
        //Multi();
        //System.out.println(sumOfTenInts());
        printSudoku();

    }

    private void Multi() {
        long[] inputArray = {1, 2, 3};
        multiplyArrayValues(inputArray, 2);
        System.out.println(Arrays.toString(inputArray));
    }

    void row2() {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
        System.out.println(row[2]);
    }

    void row4() {
        // 0
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
        System.out.println(row[4]);
    }

    void copyArray() {
        long[] inputArray = {1, 2, 3};
        inputArray = increaseCapacity(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    long[] increaseCapacity(long[] inputArray) {
        long[] outputArray = new long[(2 * inputArray.length)];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i];
        }
        return outputArray;
    }

    long[] increaseCapacityEnhanced(long[] inputArray) {
        long[] outputArray = new long[(2 * inputArray.length)];
        System.arraycopy(inputArray, 0, outputArray, 0, inputArray.length);
        return outputArray;
    }

    long[] multiplyArrayValues(long[] inputArray, int multiplier) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i] * multiplier;
        }
        return inputArray;
    }

    String getString() {
        System.out.println("Input your number");
        return scanner.nextLine();
    }


    int sumOfTenInts() {
        long[] output = new long[10];
        int sum = 0;
        String input = getString();
        for (int i = 0; i < 10; i++) {
            char charNumber = input.charAt(i);
            output[i] = Character.getNumericValue(charNumber);
            sum += output[i];
        }
        System.out.println(Arrays.toString(output));
        return sum;
    }

    void printSudoku() {
        int[][] sudo = new int[3][3];
        int[] invalidNumbers = new int[9];
        int posCount = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                int number = getRandomNumberThatIsNotUsed(invalidNumbers);
                sudo[i][j] = number;
                invalidNumbers[posCount] = number;
                posCount++;
                System.out.print(sudo[i][j] + " | ");
            }
            System.out.println();
        }
    }


    int getRandomNumberThatIsNotUsed(int[] inputArray) {
        boolean inValidNumber = true;
        int number = 0;
        while (inValidNumber) {
            number = getRandomNumber1to9();
            if (checkIfNumberIsUsed(inputArray, number)) {
                inValidNumber = false;
            }
        }
        return number;
    }

    int getRandomNumber1to9() {
        return (int) (Math.random() * 9) + 1;
    }

    boolean checkIfNumberIsUsed(int[] inputArray, int number) {
        boolean go = true;
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] == 0) {
                //do nothing
            } else if (number == inputArray[j]) {
                go = false;
                j = 10;
            } else {
                go = true;
            }
        }
        return go;
    }


}
