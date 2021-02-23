package com.rezanop.chapters.chapter1.section1;

public class Exercise5 {

    // Example of arguments: 0.5 0.25
    public static void main(String[] args) {
        System.out.println("Exercise 1.1.5: ");
        if(args.length != 2) {
            System.out.println("Please enter 2 real number.");
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.println("x and y are both between 0 and 1: " + (isBetweenZeroAndOne(x) && isBetweenZeroAndOne(y)));
    }

    public static boolean isBetweenZeroAndOne(double number) {
        return number >= 0.0 && number <= 1.0;
    }
}
