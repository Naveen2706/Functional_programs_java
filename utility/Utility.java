package com.bridgelabz.utility;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
    Scanner scanner;

    public Utility() {
        scanner = new Scanner(System.in);
    }

    public int getIntValue() {
        return scanner.nextInt();
    }

    public Double getDouble() {
        return scanner.nextDouble();
    }

    public Boolean getBoolean() {
        return scanner.nextBoolean();
    }

    public char getCharValue() {
        return scanner.next().charAt(0); 	//  next() function returns the next word in the input & charAt(0) function returns the first character in that string
    }

    // method to return flip coin percentile
    public void flipCoin(int numberOfFlip) {
        double heads =0,tails = 0;
        for(int i = 0;i < numberOfFlip; i++) {
            double side = Math.random();
            if(side>0.5)
                heads++;
            else
                tails++;
        }
        System.out.println("Number of head occurance ::" + heads);
        System.out.println("Number of tail occurance ::" + (numberOfFlip-heads));
        double headPercent = ((heads * 100)/numberOfFlip);
        double tailPercent = ((tails * 100)/numberOfFlip);
        System.out.println("Heads Percentage ::" + headPercent + "%");
        System.out.println("Tails Percentage ::" + tailPercent + "%");
    }
    // method to return two to power N value
    public void getPowerOfTwo(int powerOfTwo) {
        if( powerOfTwo <= 0 || powerOfTwo <31){
            System.out.println("Power of 2's: ");
            for(int i=0; i<=powerOfTwo; i++){
                int powerOfValue=((int)Math.pow(2,i));
                System.out.println("The value of 2^" + i + " is: "+ powerOfValue);
            }
        }
        else
            System.out.println("Value overflows int value, try again!");
    }

    // method to return year is leap year or not
    public void getLeapYearStatus(int YearToCheck) {
        boolean leapValue = false;

        if (YearToCheck % 4 == 0) {  			// if the year is divided by 4
            if (YearToCheck % 100 == 0) {		// if the year is century for leapyear must be divisible by 400
                if (YearToCheck % 400 == 0)		 // if year is divided by 400
                    leapValue = true;
                else
                    leapValue = false;
            }
            else
                leapValue = true;						 // if the year is not century
        }

        else
            leapValue = false;

        if (leapValue)
            System.out.println(YearToCheck + " is a leap year.");
        else
            System.out.println(YearToCheck + " is not a leap year.");
    }

    //Method to check largest of three numbers
    public void largestOfThreeNumbers(int firstNumber,int secondNumber,int thirdNumber) {

        if((firstNumber > secondNumber) && (firstNumber > thirdNumber))
            System.out.println(firstNumber + ":: First Number is the largest");
        else if((secondNumber > firstNumber) && (secondNumber > thirdNumber))
            System.out.println(secondNumber + ":: Second Number is the largest");
        else
            System.out.println(thirdNumber + ":: Third Number is the largest");
    }

    public <T> void print2DArray(T[][] inputArray, int rows, int columns) {
        PrintWriter printwriter = new PrintWriter(System.out);
        for (int i =0;i<rows;i++)
        {
            for (int j =0;j<columns;j++)
            {
                printwriter.write(inputArray[i][j]+" ");
                printwriter.flush();
                //System.out.print(inputArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void getTripletNumber(int[] integerArray, int numberOfIntegers){
        int tripletCount = 0;
        for(int i = 0; i < numberOfIntegers-2;i++){
            for(int j = (i + 1) ; j < numberOfIntegers- 1 ;j++){
                for(int k = (j+1); k < numberOfIntegers;k++){
                    if (integerArray[i]+integerArray[j]+integerArray[k] == 0){
                        System.out.println("The following are triplet ::");
                        System.out.println(integerArray[i] + " , " + integerArray[j] + " & " + integerArray[k]);
                        tripletCount++;
                    }
                }
            }

        }
        if(tripletCount == 0)
            System.out.println("No Such Triplets whose sum is 0");
        System.out.println("Number of triplets are ::" + tripletCount);
    }

}




