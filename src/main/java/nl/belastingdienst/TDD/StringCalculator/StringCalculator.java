package nl.belastingdienst.TDD.StringCalculator;

public class StringCalculator {
    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        String c = a + b;
        System.out.println(c);
    }

    int add(String numbers) {
        int sum = 0;
        String stringNumber = "";

        if (numbers.isBlank()) {                                        //check if number is empty or spaces
            return 0;
        }

        if (!isDigit(numbers, numbers.length() - 1)){  //check if last character is not a number
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < numbers.length(); i++) {                    //search trough every character of the string
            if (isDigit(numbers, i)) {                 //if character is an int
                stringNumber += getChar(numbers, i);                    // add int to int maker
            } else if (getChar(numbers, i) == 45){                        // if char == -
                throw new IllegalArgumentException("Negatives not allowed");
            } else {
                sum = calcSumMax1000(sum, stringNumber);
                stringNumber = "";                                      // reset stringNumber
            }
        }
        sum = calcSumMax1000(sum, stringNumber);
        return sum;
    }

    private int calcSumMax1000(int sum, String stringNumber) {
        int number = Integer.parseInt(stringNumber);
        if (number <=1000){
        sum += number;
        }                 //add stringNumber as int to sum
        return sum;
    }

    private char getChar(String numbers, int i) {
        return numbers.charAt(i);
    }

    private boolean isDigit(String numbers, int i) {
        return Character.isDigit(getChar(numbers, i));
    }
}
