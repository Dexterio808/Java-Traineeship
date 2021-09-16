package nl.belastingdienst.h4.elevenproof;

import java.util.Scanner;

public class ElevenProof {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        run();
    }

    public boolean run() {
        String input = getString();
        int sum = getSum(input);
        return isElevenProof(sum);
    }

    String getString() {
        System.out.println("Input your number");
        return scanner.nextLine();
    }

    int getSum(String input) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            char charNumber = input.charAt(i);
            int intNumber = Character.getNumericValue(charNumber);
            sum = sum + (intNumber * (9 - i));
        }
        System.out.println(sum);
        return sum;
    }

    boolean isElevenProof(int sum) {
        if ((sum % 11) == 0) {
            System.out.println("Valid account number");
            return true;
        } else {
            System.out.println("invalid account number");
            return false;
        }
    }

    void setScanner(Scanner scanner){
        this.scanner = scanner;
    }



}
