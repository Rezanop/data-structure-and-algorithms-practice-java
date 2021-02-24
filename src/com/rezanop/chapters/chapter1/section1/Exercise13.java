package com.rezanop.chapters.chapter1.section1;

import com.rezanop.libs.StdOut;

public class Exercise13 {

    private static int ROW_COUNT = 3;
    private static int COLUMN_COUNT = 4;
    private static int[][] testArray = new int[ROW_COUNT][COLUMN_COUNT];


    public static void main(String[] args) {
        fillArrayWithSeed(0);
        printArray();
        transpose();
        printArray();
        transpose();
        printArray();
        transpose();
        printArray();
    }

    /**
     * Fill the array with number relative to the seed.
     * @param seed - The seed number used to generate numbers
     */
    private static void fillArrayWithSeed(final int seed) {
        int count = seed;
        for(int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COLUMN_COUNT; j++) {
                testArray[i][j] = count;
                count ++;
            }
        }
    }

    /**
     * Prints a formatted format of the array for better readability.
     */
    private static void printArray() {
        StdOut.println("Printing Array...");
        for (int[] row: testArray) {
            for ( int cell: row) {
                StdOut.print("| " + cell);
            }
            StdOut.println();
        }
    }

    /**
     * Transpose The Array.
     */
    private static void transpose() {
        int[][] result = new int[COLUMN_COUNT][ROW_COUNT];

        for(int j = 0; j < result.length; j++) {
            for (int i = 0; i < result[j].length; i++) {
                result[j][i] = testArray[i][j];
            }
        }
        testArray = result;
        swapAxes();
    }

    /**
     * Swap the column and row counts after the array is transposed.
     */
    private static void swapAxes() {
        int temp;
        temp = ROW_COUNT;
        ROW_COUNT = COLUMN_COUNT;
        COLUMN_COUNT = temp;
    }




}
