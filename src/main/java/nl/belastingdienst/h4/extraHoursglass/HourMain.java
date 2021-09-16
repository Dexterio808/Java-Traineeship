package nl.belastingdienst.h4.extraHoursglass;

public class HourMain {
    private static int attempts = 0;

   public static void createHourglass(){
       try {
           HourLogic.buildHourglass(HourLogic.validInput());
       } catch (EvenNumberException e) {
           if (attempts < 2) {
               attempts++;
               createHourglass();
           } else {
               System.out.println("Program finished");
           }
       }
   }


}
