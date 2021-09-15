package nl.belastingdienst;
import nl.belastingdienst.h4.elevenproof.ElevenProof;
import nl.belastingdienst.h4.elevenproof.extraHoursglass.HourMain;
import nl.belastingdienst.h5.Fibo;
import nl.belastingdienst.h5.FiboLong;
import nl.belastingdienst.h5.Method;

import java.util.Scanner;

public class MyFirstClass {

    public static void plusPlus(){
        int a = 1;
        int b = 1;

        System.out.println("a++ = " + a++);
        System.out.println(a);
        System.out.println("++a = " + ++b);
        System.out.println(b);
    }

    public static void resultJ(){
        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println(j);
        // 3 is niet kleiner dan 3 = false
        // ++i = 3 + 1 = 4
        // 4 >>> 1 = 0100 -> 0010 = 2
    }

    public static void binarySum(){
        byte a = 0b1010;
        byte b = 0b0100;
        System.out.println( a + b);
    }

    public static void time(){
        int a = 23; //current time
        int b = 80; //time to pass

        int c = (a + b) % 24;// 7 hours left
        int d = (a + b) / 24;// 4.29 days, when put into int d = 4
        System.out.println(c);
        System.out.println(d);
    }

    public static void primitiveSizes(){
        System.out.println(" Byte = " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println(" Int = " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println(" Long = " + Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println(" Short = " + Short.MIN_VALUE + " " + Short.MAX_VALUE);
        System.out.println(" Float =" + Float.MIN_VALUE + " " + Float.MAX_VALUE);
        System.out.println(" Double = " + Double.MIN_VALUE + " " + Double.MAX_VALUE);
        System.out.println(" Char = " + (int)Character.MIN_VALUE + " " + (int)Character.MAX_VALUE);
    }

    public static void intOverflow() {
        int a = 2147483647; // max int value
        long b = 2147483647;
        a++;
        System.out.println(a);
        System.out.println("Using long");
        b = ++b;
        System.out.println(b);
    }

    public static void weekday(){
        Weekday day1 = Weekday.THURSDAY;
        System.out.println(day1);
    }

    public static void trainee(){
        Trainee pepijn = new Trainee("Pepijn", "Tournoij");
        pepijn.printFullName();
    }

    public static void  elevenProof(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input account number:");
        int accountNumber = input.nextInt();


        for (int i = 0; i < 10; i++){

        }
    }



    public static void main(String[] args) {
        //plusPlus();
        //resultJ();
        //binarySum();
        //time();
        //primitiveSizes();
        //Client.client1();
        /*
        Extra:
        1. With static typing, it is not possible to redefine a variable type. with dynamic that is possible.
        2. Prevent accidental type changes
        2. primitive types are stored in the stack, and reference types are stored in the heap
        3. You get an Error that is cause by the "string" which is not written with an capitol S. so string is this instance wont be a variable type.
        4. Command box: 12. it will make a new string combining the 1 and a 2. making 12
        5. Error: you can't use short and long as variable names because they ar variable types themself.
         */

        //intOverflow();

        //7. stack is for primitive storage. heap is for reference types

        //weekday();
        //trainee();

        //10. Remove objects from memory when they aren't being used to free up memory space when needed
        //H7.start();
        //Bank.bankDemo();
        //ElevenProof.start();
        //HourMain.createHourglass();
        //Method.start();
        FiboLong.start();



    }

}
