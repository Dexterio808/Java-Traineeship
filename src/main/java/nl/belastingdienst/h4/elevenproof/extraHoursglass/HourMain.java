package nl.belastingdienst.h4.elevenproof.extraHoursglass;

import java.util.Scanner;

public class HourMain {

   public static void createHourglass(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("n:");
       HourLogic.buildHourglass(scanner.nextInt());

   }

}
