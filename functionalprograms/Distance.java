package com.bridgelabz.functionalprograms;

public class Distance {

    // Function to calculate distance
    static double distance(int x1, int y1, int x2, int y2)
    {
        // Calculating distance
        return Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));
    }
    public static void main (String[] args)
    {

        System.out.println(distance(2, 0, 4, 0));
    }
}



