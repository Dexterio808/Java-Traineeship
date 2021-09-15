package nl.belastingdienst.tafels;

public class Tafels {
    private static int tableCycle = 1;

    public static void start(){

        for (int i = 1; i <= 10; i++) {
            createTable(i);
            System.out.println();
        }


    }



    private static void createTable(int input){
        createTable(input, 1);
    }

    private static void createTable(int input, int tableCycle){
        if (tableCycle > 10){ return;}
        System.out.println(tableCycle +  "\u00d7"  + input + " = " + tableCycle * input);
        tableCycle++;
        createTable(input, tableCycle);
    }

    private static void createTable2(int input){
        if (tableCycle > 10){ return;}
        System.out.println(tableCycle + " X " + input + " = " + tableCycle * input);
        tableCycle++;
        createTable2(input);
    }


    public static void createTableWithLoop(int n) {
        for (int i = 1; i < 11; i++){
            System.out.println(i + " X " + n + " = " + i * n);
        }
    }

}
