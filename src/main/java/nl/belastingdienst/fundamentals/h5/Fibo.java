package nl.belastingdienst.fundamentals.h5;

public class Fibo {
    public static void start(){
        run(10);
    }

    public static void run(int n) {
        int a = 1;
        int b = 0;
        int c = 1;
        System.out.println(1);
        for (int i = 0; i < n; i++){
            System.out.print(c + " ");
            b = a;
            a = c;
            c = a + b;
        }
    }

    public static void run(int start, int n ){

    }






}
