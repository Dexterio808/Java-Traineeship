package nl.belastingdienst.lambda;

public class LambdaStuff {

    public void start(){
        MyPrintSomething printSomething = () -> System.out.println("hello");
        MyMultiplyByTwo multiplyByTwo = (int a) -> a * 2;
        MyAddTwoNumbers addTwoNumbers = (int a, int b) -> a + b;
        LambdaStuffInterface multiLine = (int a, int b) -> {
            a = a + b;
            if ( a > 10){
                System.out.println(a +" is larger then 10");
            } else {
                System.out.println(a +" is smaller then 10");
            }
            return a;
        };

        MyInnerLambda saySomething = () -> System.out.println("I'll never give you up");
        MyInnerLambda sayNever = () -> System.out.println("Never gonna let you down");

        printSomething.run();
        multiplyByTwo.run(4);
        addTwoNumbers.run(5,7);
        multiLine.run(4,15);

        saySomething.run();
        sayNever.run();
    }

    void rickRoll(){
        //saySomething.run(); doesn't compile. saySomething out of scope
    }

    //Create lambda interface with innerClass
    public interface MyInnerLambda{
        void run();
    }
}


