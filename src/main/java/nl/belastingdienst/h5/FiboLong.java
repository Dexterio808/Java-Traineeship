package nl.belastingdienst.h5;

public class FiboLong {
    public static void start(){
        System.out.println("46");
        goldenRatio(46);
        System.out.println("47:");
        goldenRatio(47);


    }

    public static long run(int n) {
        long a = 1;
        long b = 0;
        long c = 1;
        System.out.print(a + " ");
        for (int i = 0; i < n; i++){
            System.out.print(c + " ");
            b = a;
            a = c;
            c = a + b;
        }
        System.out.println();
        return a;
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

    public static void goldenRatio(int n){
        double gr = (double)run(n) / run(n-1);
        System.out.println(gr);
    }
}
