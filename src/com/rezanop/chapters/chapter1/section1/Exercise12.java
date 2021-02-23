package com.rezanop.chapters.chapter1.section1;

public class Exercise12 {

    public static void main(String[] args) {
        int[] a = new int[10];

        // Initialize the array to 9, 8, 7, ...0
        for (int i = 0; i < 10; i++) {
            a[i] = 9 -i;
        }
        // Reverse the array to 0, 1, 2, ...9
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
