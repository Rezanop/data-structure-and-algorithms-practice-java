package com.rezanop.chapters.chapter1.section1;

public class Exercise3 {

    // Example parameters 12 13 14 => Not Equal
    public static void main(String[] args) {
        System.out.println("Exercise 1.1.3: ");
        if(args.length != 3) {
            System.out.println("Please enter 3 integers to be compared");
            return;
        }
        // String comparison
        final boolean firstEqualsSecond = args[0].equals(args[1]);
        // Integer Comparison
        final boolean secondEqualsThird = Integer.parseInt(args[1]) == Integer.parseInt(args[2]);

        String result = firstEqualsSecond && secondEqualsThird ?
                "equal" : "not equal";

        System.out.println("The values are " + result);
    }
}
