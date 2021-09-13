package nl.belastingdienst.h4.elevenproof.extraHoursglass;

public class HourLogic {


    public static void buildHourglass(int input){
        int middle = (input-1)/2;
        for (int i = 0; i< input; i++){             //size hourglass
            if ( i == 0 || i == input - 1){         //if first or last row
                for (int j = 0; j< input; j++){     //prints "*" 9 times
                    System.out.print("*");
                }
                System.out.println();
            } else if (i == middle ){          //if middle of hourglass
                for (int j = 0; j < input; j++) {
                    if (j == middle){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < input; j++){
                    if (input == 0) {

                    }
                }
            }
        }
    }
}
