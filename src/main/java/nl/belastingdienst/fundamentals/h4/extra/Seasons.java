package nl.belastingdienst.fundamentals.h4.extra;

public class Seasons {


    public static void seasonsStuff() {
        Season check = Season.WINTER;
        String warm = "warm";
        String cold = "cold";

        switch (check) {
            case SPRING:
            case SUMMER:
                System.out.println(warm);
                break;
            case FALL:
            case WINTER:
                System.out.println(cold);
            default:
                System.out.println("unknown");


        }
    }
}
