package com.rezanop.chapters.chapter1.section1;

import com.rezanop.libs.StdOut;

public class Exercise15 {

    public static void main(String[] args) {
        int[] testArray;
        testArray = generateArray(100);
        printArray(testArray);
        printArray(histogram(testArray, 40));
        printArray(histogram(testArray, 20));

    }

    /**
     * Generates a random array, we use the % to control the max number in the array.
     * @param arraySize The array size
     * @return a new array filled with pseudo-random numbers.
     */
    private static int[] generateArray(final int arraySize) {
        int[] result = new int[arraySize];
        for (int i = 0; i < arraySize ; i++) {
            result[i] = (i != 0) ? 33 % i + 27 % i: 0;
        }
        return result;
    }

    /**
     * The histogram function that counts the number of duplication per value.
     * @param array The array to check for duplicated values
     * @param number The maximum value to check for duplication, otherwise the value is ignored.
     * @return The duplication count list
     */
    private static int[] histogram(int[] array, int number) {
        int[] result = new int[number];
        for (int i : array) {
            if (i > number) break;
            result[i]++;
        }
        return result;
    }

    /**
     * Utility formatting and printing function
     * @param arrayToPrint The array to print
     */
    private static void printArray(int[] arrayToPrint) {
        StdOut.println("Printing Array...");
        for(int element: arrayToPrint) {
            StdOut.print("[" + element + "] ");
        }
        StdOut.println();
    }
}
