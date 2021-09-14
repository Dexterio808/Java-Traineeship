package nl.belastingdienst.h4.elevenproof.extraHoursglass;

import java.util.Scanner;

public class HourLogic {
    private static Scanner scanner = new Scanner(System.in);
    public static int attempt = 0;


    public  static int InputNumber() {
        System.out.println("Enter your uneven number:");
        int a = scanner.nextInt();
        return a;
    }

    public static int validInput() throws EvenNumberException {
        int input = InputNumber();
        if (input % 2 != 0) {
            return input;
            } else {
                throw new EvenNumberException();
            }
    }






    public static void buildHourglass(int input){
        int middle = (input+1)/2;
        for (int i = 0; i< input; i++){             //size hourglass
            if ( i == 0 || i == input - 1){         //if first or last row
                for (int j = 0; j< input; j++){     //prints "*" 9 times
                    System.out.print("*");
                }
            } else {
                    for (int k = 0; k < input; k++) {
                        if (k == i || k == (input - (i +1))){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
            }
            System.out.println();
        }
    }
}
