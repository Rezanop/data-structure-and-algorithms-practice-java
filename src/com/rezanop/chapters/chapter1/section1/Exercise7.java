package com.rezanop.chapters.chapter1.section1;

import com.rezanop.libs.StdOut;

public class Exercise7 {

    public static void main(String[] args) {
        double a = firstStatement();
        StdOut.printf("a.  %.5f\n", a);
        int b = secondStatement();
        StdOut.println("b. "+ b);
        int c = thirdStatement();
        StdOut.println("c. " + c);


    }

    private static double firstStatement() {
        double t  = 9.0;
        while(Math.abs(t - 9.0/t) > .001){
            t = (9.0/t + t)  / 2.0;
        }
        return t;
    }

    private static int secondStatement() {
        int sum = 0;
        for (int i = 1; i < 1000;i++) {
            for (int j = 1; j < i ; j++) {
                sum++;
            }
        }
        return sum;
    }

    private static int thirdStatement() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 100; j++) {
                sum++;
            }
        }
        return sum;
    }
}
