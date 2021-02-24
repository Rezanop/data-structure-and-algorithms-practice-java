package com.rezanop.chapters.chapter1.section1;

import com.rezanop.libs.StdOut;

public class Exercise14 {

    public static void main (String[] args) {
        // Expect 9
        StdOut.println(largestNumberUnderBase2LogOf(550));
        // Expect 6
        StdOut.println(largestNumberUnderBase2LogOf(100));
        // Except 6
        StdOut.println(largestNumberUnderBase2LogOf(80));
        // Expect 3
        StdOut.println(largestNumberUnderBase2LogOf(8));
        // Expect 3
        StdOut.println(largestNumberUnderBase2LogOf(9));
        // Expect 0
        StdOut.println(largestNumberUnderBase2LogOf(1));
    }

    private static int largestNumberUnderBase2LogOf(final int number) {
        int count = 0;
        int n = number;
        while (n > 1) {
            n = n / 2;
            count ++;
        }
        return count;
    }
}
