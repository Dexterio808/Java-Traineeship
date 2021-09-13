package nl.belastingdienst.h4.elevenproof;

import java.util.Arrays;
import java.util.Scanner;

public class ElevenProof {
    public static void start(){
        check();
    }

    public static char[] intInput9() throws InvalidNumberException{
        Scanner input = new Scanner(System.in);
        char[] userInputArray;
        userInputArray = new char[9];

        System.out.println("Input your number");
        int userInput = input.nextInt();

        if (String.valueOf(userInput).length() == 9) {
            String string_number = Integer.toString(userInput);
            for (int i = 0; i < 9; i++) {
                userInputArray[i] = (string_number.charAt(i));
            }
            System.out.println(Arrays.toString(userInputArray));
            return userInputArray;
        } else {
            throw new InvalidNumberException(userInput);
        }
    }

    public static void check(){

        try{
            char[] input = intInput9();
            int j= 0;
            int sum = 0;
            for (int i = 9; i != 0; i--){
                sum = sum + (i * Character.getNumericValue(input[j]));
                j++;
                System.out.println(sum);
            }
            if ((sum % 11) == 0){
                System.out.println("Valid account number");
            } else {
                System.out.println("invalid account number");
            }

        } catch(InvalidNumberException e) {
            System.out.println("invalid input");
        }

    }



}
