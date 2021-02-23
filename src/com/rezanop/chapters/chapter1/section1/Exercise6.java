package com.rezanop.chapters.chapter1.section1;

import com.rezanop.libs.StdOut;

public class Exercise6 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.printf("iter.%d: f = %d AND g = %d", i, f, g);
            StdOut.println();
            f = f + g;
            g = f - g;
        }

    }


}
