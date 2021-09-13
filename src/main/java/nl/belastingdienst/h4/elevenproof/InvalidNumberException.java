package nl.belastingdienst.h4.elevenproof;

public class InvalidNumberException extends Exception{
    private int userInput;

    public InvalidNumberException(int userInput){
        this.userInput = userInput;
    }

    public static void numbersAmount(int userInput){
        if (userInput < 9) {
            System.out.println("Your number is too small");
        } else {
            System.out.println("Your number is too big");
        }
    }

}
