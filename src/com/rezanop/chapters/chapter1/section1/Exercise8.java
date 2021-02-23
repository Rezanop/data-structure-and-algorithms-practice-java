package com.rezanop.chapters.chapter1.section1;

public class Exercise8 {

    public static void main(String[] args) {
        // Prints the character
        System.out.println('b');
        // Prints the total number of the 2 letters UTF-8 numeric representation
        // b = 98 & c = 99 ==> b + c = 197
        System.out.println('b' + 'c');
        // Takes the total number of the letter a UTF-8 numeric representation
        // then recast the number into a character
        System.out.println((char) ('a' + 4));
    }
}
