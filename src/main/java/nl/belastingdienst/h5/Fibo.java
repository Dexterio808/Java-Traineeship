package nl.belastingdienst.h5;

public class Fibo {
    public static void start(){

//        goldenRatio(10);
//        goldenRatio(46);
//        goldenRatio(47);
//        goldenRatio(48);
//        goldenRatio(49);
        for (int i = 46; i < 56; i++) {
            goldenRatio(i);
        }


    }

    public static int run(int n) {
        int a = 1;
        int b = 0;
        int c = 1;
        System.out.print(a + " ");
        for (int i = 0; i < n -1; i++){
            System.out.print(c + " ");
            b = a;
            a = c;
            c = a + b;
        }
        System.out.println();
        return a;
    }

    public static int run(int start, int n ){
        int base = start;
        int print = start;
        int old;
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

    public static int run(int f1, int f2, int n ){
        int base = f1;
        int print = f2;
        int old;
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

    public static void goldenRatio(int n){
        double gr = (double)run(n) / run(n-1);
        System.out.println(gr);
    }



}
