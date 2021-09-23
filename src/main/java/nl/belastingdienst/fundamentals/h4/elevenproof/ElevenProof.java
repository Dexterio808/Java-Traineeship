package nl.belastingdienst.fundamentals.h4.elevenproof;

import java.util.Scanner;

public class ElevenProof {
    private Scanner scanner = new Scanner(System.in);
    static int ELEVEN = 1;

    public void start() {
        //run();
    }

    int genEleven(){
        int[] eleven = new int[9];
        StringBuilder elevenString = new StringBuilder();
        int target = 11 * ELEVEN++;
        StringBuilder srtb = new StringBuilder();

        for (int i = 0; i < (9); i++) {
            while(target >= (9 -i) && eleven[i] <9){
                eleven[i] += 1;
                target -= (9- i);

            }
            elevenString.append(eleven[i]);
        }
        return Integer.parseInt(elevenString.toString());

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
