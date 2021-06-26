package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class numberOfTriplets {
    public static void main(String[] args) {
        Utility utility = new Utility();
        int numberOfIntegers = utility.getIntValue();
        int[] integerArray = new int[numberOfIntegers];
        for (int i = 0; i <= numberOfIntegers; i++) {
            integerArray[i] = utility.getIntValue();
            System.out.println(integerArray[i]);
        }

            System.out.println(utility.getTripletNumber(integerArray,numberOfIntegers));
    }
}


