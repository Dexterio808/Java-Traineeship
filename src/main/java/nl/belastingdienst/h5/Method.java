package nl.belastingdienst.h5;

import java.util.List;

public class Method {

    public static void start(){
        System.out.println(greatest(5,16));
        System.out.println(greatest("Hallo", "Wereld"));
        System.out.println(greatest(4,6,8,15));
        System.out.println(factorial(1));
        System.out.println(factorial(5));
    }

    public static int greatest(int a, int b){
        if (a >= b){
            return a;
        } else {
            return b;
        }
    }
    public static String greatest(String a, String b){
        if (a.length() >= b.length()){
            return a;
        }else {
            return b;
        }
    }
    public static int greatest(int... a){
        int greatestNumber = 0;
        for (int j : a) {
            if (greatestNumber < j) {
                greatestNumber = j;
            }
        }
        return greatestNumber;
    }

    public static int factorial(int n){
        if (n == 1){
            return n;
        } else {
            return n * factorial(n-1);
        }
    }






}
