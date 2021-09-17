package nl.belastingdienst.h5;

import java.util.Arrays;

public class FiboLong {
    public static void start(){
//        System.out.println("46");
//        goldenRatio(46);
//        System.out.println("47:");
//        goldenRatio(47);

//        System.out.println(goldenRatio(92));
//        System.out.println(goldenRatio(93));
        System.out.println(Arrays.toString(run(5)));

    }

  /*  private static void checkMax() {
        boolean gold = true;
        int i = 46;
        while (gold){
            double check = goldenRatio(i);
            if (check < 1.6 || check > 1.7) {
                gold = false;
                System.out.println(i);
            } else {
                i++;
            }
        }
    }*/

    public static long[] run(int n) {
        long[] fibo = new long[n];
        long a = 1;
        long b = 0;
        long c = 1;
        System.out.print(a + " ");
        fibo[0] = a;
        for (int i = 0; i < n -1; i++){
            System.out.print(c + " ");
            fibo[i+1] = c;
            b = a;
            a = c;
            c = a + b;
        }
        System.out.println();
        return fibo;
    }

    public static long run(int start, int n ){
        long base = start;
        long print = start;
        long old;
        System.out.print(print + " ");
        for (int i = 0; i < n - 1; i++){
            System.out.print(print + " ");
            old = base;
            base = print;
            print = base + old;
        }
        System.out.println();
        return base;
    }

    public static long run(int f1, int f2, int n ){
        long base = f1;
        long print = f2;
        long old;
        System.out.print(base + " ");

        for (int i = 0; i < n - 2; i++){
            System.out.print(print + " ");
            old = base;
            base = print;
            print = base + old;
        }
        System.out.println();
        return base;
    }

//    public static double goldenRatio(int n){
//        return (double)run(n) / run(n-1);
//
//    }
}
