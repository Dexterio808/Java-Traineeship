package nl.belastingdienst.h6.array;

import java.util.Arrays;

public class H6Assignment {

    public void start(){
        //row2();
        //row4();
        //copyArray();
        long[] inputArray = {1,2,3};
        multiplyArrayValues(inputArray, 2);
        System.out.println(Arrays.toString(inputArray));

    }

    void row2(){
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
        System.out.println(row[2]);
    }

    void row4() {
        // 0
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
        System.out.println(row[4]);
    }

    void copyArray(){
        long[] inputArray = {1, 2 , 3};
        inputArray = increaseCapacity(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    long[] increaseCapacity(long[] inputArray) {
        long[] outputArray = new long[(2 * inputArray.length)];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i];
        }
        return outputArray;
    }

    long[] increaseCapacityEnhanced(long[] inputArray) {
        long[] outputArray = new long[(2 * inputArray.length)];
        System.arraycopy(inputArray, 0, outputArray, 0, inputArray.length);
        return outputArray;
    }

    long[] multiplyArrayValues(long[] inputArray, int multiplier){
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i] * multiplier;
        }
        return inputArray;
    }


}
