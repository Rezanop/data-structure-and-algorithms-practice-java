package com.rezanop.chapters.chapter1.section1;

import com.rezanop.libs.StdOut;

public class Exercise9 {

    public static void main(String[] args) {
        StdOut.println("8 => " + binaryRepresentation(8));
        StdOut.println("9 => " + binaryRepresentation(9));
        StdOut.println("10=> " + binaryRepresentation(10));
        StdOut.println("64=> " + binaryRepresentation(64));
        StdOut.println("125=> " + binaryRepresentation(125));
    }

    private static String binaryRepresentation(int number) {
        String binaryResult = "";
        int p = number;
        while(p > 0) {
            binaryResult = (p % 2) + binaryResult;
            p = p / 2;
        }
        return binaryResult;
    }
}
