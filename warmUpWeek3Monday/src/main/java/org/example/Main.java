package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] intArray= new int[5];

        intArray[0]= 43;
        intArray[1]= 29;
        intArray[2]= 31;
        intArray[3]= 22;
        intArray[4]= 76;

        Arrays.sort(intArray);

        for( int i: intArray){
            System.out.printf("The value of i is now: %d \n", i);
            System.out.println(i);
        }




    }
}