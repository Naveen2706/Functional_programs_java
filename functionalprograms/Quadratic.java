package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of a");
        double a = scanner.nextDouble();
        System.out.println("enter value of b");
        double b = scanner.nextDouble();
        System.out.println("enter value of c");
        double c = scanner.nextDouble();
        double root1, root2;

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("root1 and root2 are:: " + root1 + " " + root2);
        }
    }
}