package nl.belastingdienst.lambdaDemo;

public class LambdaDemo {



    public static void main(String[] args) {

        helloWorld();


    }

    static void helloWorld(){
        System.out.println("Hello World!");
    }

    static int multiplyBy3(int a){
        return a * 3;
    }

    static int addTwoNumbers(int a, int b){
        return a + b;
    }

    boolean isLargerThen10(int a){
        if (a > 10){
            return true;
        } else {
            return false;
        }
    }

    interface MyMultiplyLambda{
        int run(int a);
    }
}
